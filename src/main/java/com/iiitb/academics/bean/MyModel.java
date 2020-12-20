package com.iiitb.academics.bean;

import java.util.List;

public class MyModel {
    int student_id;
    String first_name;
    String last_name;
    String roll_no;
    String email;

    List<MyCourseModel> courses;



    public MyModel(int student_id, String first_name, String last_name, String roll_no, String email,  List<MyCourseModel> courses) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.roll_no = roll_no;
        this.email = email;
        this.courses = courses;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  List<MyCourseModel> getCourses() {
        return courses;
    }

    public void setCourses( List<MyCourseModel> courses) {
        this.courses = courses;
    }
}