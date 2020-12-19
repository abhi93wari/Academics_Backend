package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Courses,Integer> {
}
