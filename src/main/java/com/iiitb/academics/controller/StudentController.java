package com.iiitb.academics.controller;

import com.iiitb.academics.bean.MyCourseModel;
import com.iiitb.academics.bean.MyModel;
import com.iiitb.academics.bean.Students;
import com.iiitb.academics.services.AcademicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private AcademicServices services;

    @GetMapping("/Students")
    public List<Students> list(){
        return services.getAll();
    }

    @CrossOrigin
    @GetMapping("/Students/{email}")
    public MyModel getStudent(@PathVariable(value = "email") String email){
        return services.findByEmail(email);
    }
}
