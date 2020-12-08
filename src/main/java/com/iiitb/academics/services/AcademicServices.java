package com.iiitb.academics.services;

import com.iiitb.academics.bean.Students;
import com.iiitb.academics.controller.AcademicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicServices {

    @Autowired
    private AcademicRepository repo;

    public List<Students> getAll(){
        return repo.findAll();

    }

    public void save(Students student){
        repo.save(student);
    }

    public Students get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }





}
