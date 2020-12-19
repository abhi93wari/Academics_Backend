package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Course_TA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseTARepo extends JpaRepository<Course_TA,Integer> {
}
