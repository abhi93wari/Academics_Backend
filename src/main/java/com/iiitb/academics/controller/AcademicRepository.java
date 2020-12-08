package com.iiitb.academics.controller;

import com.iiitb.academics.bean.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRepository extends JpaRepository<Students,Integer> {

}
