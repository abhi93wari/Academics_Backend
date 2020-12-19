package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Student_Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepo extends JpaRepository<Student_Courses,Integer> {
}
