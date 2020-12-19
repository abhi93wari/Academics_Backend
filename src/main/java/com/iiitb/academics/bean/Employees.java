package com.iiitb.academics.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {

    int employees_id;
    String first_name;
    String last_name;

    public Employees() {
    }

    public Employees(int employees_id, String first_name, String last_name) {
        this.employees_id = employees_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    @Id
    public int getEmployees_id() {
        return employees_id;
    }

    public void setEmployees_id(int employees_id) {
        this.employees_id = employees_id;
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
}
