package com.iiitb.academics.bean

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int student_id;
    @Column(nullable = false)
    String first_name;
    String last_name;
    @Column(nullable = false,unique = true)
    String roll_no;
    @Column(nullable = false,unique = true)
    String email;
    @Column(nullable = false, columnDefinition="default '0.0'")
    float cgpa;
    @Column(nullable = false)
    int total_credits;
    @Column
    int graduation_year;

    public Students() {
    }

    public Students(int student_id, String first_name, String last_name, String roll_no, String email, float cgpa, int total_credits, int graduation_year) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.roll_no = roll_no;
        this.email = email;
        this.cgpa = cgpa;
        this.total_credits = total_credits;
        this.graduation_year = graduation_year;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public int getTotal_credits() {
        return total_credits;
    }

    public void setTotal_credits(int total_credits) {
        this.total_credits = total_credits;
    }

    public int getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(int graduation_year) {
        this.graduation_year = graduation_year;
    }
}

    public void setEmail(String email) {
        this.email = email;
    }
}
