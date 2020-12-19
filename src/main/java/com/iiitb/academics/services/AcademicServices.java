package com.iiitb.academics.services;

import com.iiitb.academics.bean.*;
import com.iiitb.academics.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Students findByEmail(String email)
    {
        List<Students> students = getAll();
        Students student = null;
        for(Students s: students){
            if(s.getEmail().equalsIgnoreCase(email)){
                student = s;
                break;
            }
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


        System.out.println("Student Details is "+student+"\n");
        System.out.println("Course Details is "+coursesDetails+"\n");
        System.out.println("Schedule Details is "+mySchedule+"\n");
        System.out.println();


        return student;
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














}
