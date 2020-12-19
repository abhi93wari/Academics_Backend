package com.iiitb.academics.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {


    int course_id;
    String course_code;
    String name;
    int faculty;

    public Courses(){

    }

    public Courses(int course_id, String course_code, String name, int faculty) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.name = name;
        this.faculty = faculty;
    }

    @Id
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
}
