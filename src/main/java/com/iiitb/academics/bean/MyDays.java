package com.iiitb.academics.bean;

import java.util.List;

public class MyDays {
    String time;
    String day;
    String room;

    public MyDays(String time, String day, String room) {
        this.time = time;
        this.day = day;
        this.room = room;
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
