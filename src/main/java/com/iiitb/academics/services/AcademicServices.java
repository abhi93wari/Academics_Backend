package com.iiitb.academics.services;

import com.iiitb.academics.bean.*;
import com.iiitb.academics.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcademicServices {

    @Autowired
    private AcademicRepository repo;

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private StudentCourseRepo studCourseRepo;

    @Autowired
    private CourseScheduleRepo courseScheduleRepo;

    @Autowired
    private CourseTARepo courseTARepo;

    @Autowired
    private EmployeeRepo employeeRepo;



    public List<Students> getAll(){
        return repo.findAll();

    }

    public MyModel findByEmail(String email)
    {
        List<Students> students = getAll();
        Students student = null;
        for(Students s: students){
            if(s.getEmail().equalsIgnoreCase(email)){
                student = s;
                break;
            }
        }

        if(student==null){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Invalid Email"
            );
        }

        List<Student_Courses> mycourses = getStudCoursebyId(student.getStudent_id());
        List<Integer> courseIds = new ArrayList<>();
        for(Student_Courses s: mycourses){
            if(!courseIds.contains(s.getCourse_id())){
                courseIds.add(s.getCourse_id());
            }
        }
        List<Courses> coursesDetails = getMyCourses(courseIds);
        List<Course_Schedule> mySchedule = getmySchedule(courseIds);

        List<Employees> employees = getAllEmp();
        List<Course_TA> mytas = getTAs(courseIds);




        System.out.println("Student Details is "+student+"\n");
        System.out.println("Course Details is "+coursesDetails+"\n");
        System.out.println("Schedule Details is "+mySchedule+"\n");
        System.out.println();

        List<MyCourseModel> cmList = new ArrayList<>();

        for(Courses c: coursesDetails){
            MyCourseModel cm = new MyCourseModel();
            cm.setCourse_id(c.getCourse_id());
            cm.setCourse_code(c.getCourse_code());
            cm.setName(c.getName());

            for(Employees e : employees){
                if(e.getEmployees_id()==c.getFaculty()){
                    cm.setFaculty_name(e.getFirst_name()+" "+e.getLast_name());
                }
            }

            List<MyDays> myDays = new ArrayList<>();

            for(Course_Schedule cs : mySchedule){
                if(cs.getCourse_id()==c.getCourse_id()){
                    MyDays myDay = new MyDays(cs.getTime(),cs.getDay(),cs.getRoom());
                    myDays.add(myDay);

                }
            }
            for(Course_TA ta : mytas){
                if(ta.getCourse_id()==c.getCourse_id()){
                    List<Students> talist = getAll();
                    for(Students s: talist){
                        if(s.getStudent_id() == ta.getStudent_id()){
                            cm.setTa_name(s.getFirst_name()+" "+s.getLast_name());
                            break;
                        }
                    }

                }
            }
            cm.setDaysList(myDays);
            cmList.add(cm);

        }

        MyModel myModel = new MyModel(student.getStudent_id(),student.getFirst_name(),student.getLast_name(),student.getRoll_no(),student.getEmail(),cmList);




        return myModel;

    }

    public List<Courses> getMyCourses(List<Integer> myCoursesId){
        List<Courses> allCourses =  courseRepo.findAll();
        List<Courses> myCourses = new ArrayList<>();

        for(Courses c : allCourses){
            if(myCoursesId.contains(c.getCourse_id())){
                myCourses.add(c);
            }
        }

        return myCourses;

    }

    public List<Student_Courses> getStudCoursebyId(int studentId){

        List<Student_Courses> allcourses =  studCourseRepo.findAll();

        List<Student_Courses> mycourses = new ArrayList<>();

        for(Student_Courses s : allcourses){
            if(s.getStudent_id()==studentId){
                mycourses.add(s);
            }
        }

        return mycourses;
    }

    public List<Course_Schedule> getmySchedule(List<Integer> courseIds){
        List<Course_Schedule> allCoursesSchedule =  courseScheduleRepo.findAll();
        List<Course_Schedule> myCourseschedule = new ArrayList<>();

        for(Course_Schedule c : allCoursesSchedule){
            if(courseIds.contains(c.getCourse_id())){
                myCourseschedule.add(c);
            }
        }

        return myCourseschedule;

    }


    public List<Course_TA> getTAs(List<Integer> myCoursesId){
        List<Course_TA> allCoursesTA =  courseTARepo.findAll();
        List<Course_TA> myCoursesTA = new ArrayList<>();

        for(Course_TA t : allCoursesTA){
            if(myCoursesId.contains(t.getCourse_id())){
                myCoursesTA.add(t);
            }
        }
        return myCoursesTA;
    }

    public List<Employees> getAllEmp(){
        return employeeRepo.findAll();
    }













}
