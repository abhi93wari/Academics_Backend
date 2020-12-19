package com.iiitb.academics.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course_Schedule {
    int id;
    int course_id;
    String time;
    String day;
    String room;

    public Course_Schedule() {
    }

    public Course_Schedule(int id, int course_id, String time, String day, String room) {
        this.id = id;
        this.course_id = course_id;
        this.time = time;
        this.day = day;
        this.room = room;
    }
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
