package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Courses;
import com.iiitb.academics.bean.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicRepository extends JpaRepository<Students,Integer> {

}

