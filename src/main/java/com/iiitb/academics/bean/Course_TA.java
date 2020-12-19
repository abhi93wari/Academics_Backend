package com.iiitb.academics.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course_TA {
    int course_id;
    int student_id;
    int id;

    public Course_TA() {
    }

    public Course_TA(int course_id, int student_id, int id) {
        this.course_id = course_id;
        this.student_id = student_id;
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
