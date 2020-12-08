package com.iiitb.academics.controller;

import com.iiitb.academics.bean.Students;
import com.iiitb.academics.services.AcademicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private AcademicServices services;

    @GetMapping("/Students")
    public List<Students> list(){
        return services.getAll();
    }
}
