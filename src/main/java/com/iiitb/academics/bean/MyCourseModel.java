package com.iiitb.academics.bean;

import java.util.List;

public class MyCourseModel {
    int course_id;
    String course_code;
    String name;
    int faculty;
    String faculty_name;
    String ta_name;
    List<MyDays> daysList;

    public MyCourseModel() {
    }

    public MyCourseModel(int course_id, String course_code, String name, int faculty, String faculty_name, String ta_name, List<MyDays> daysList) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.name = name;
        this.faculty = faculty;
        this.faculty_name = faculty_name;
        this.ta_name = ta_name;
        this.daysList = daysList;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getTa_name() {
        return ta_name;
    }

    public void setTa_name(String ta_name) {
        this.ta_name = ta_name;
    }

    public List<MyDays> getDaysList() {
        return daysList;
    }

    public void setDaysList(List<MyDays> daysList) {
        this.daysList = daysList;
    }
}
