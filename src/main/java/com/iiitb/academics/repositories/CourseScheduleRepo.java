package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Course_Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseScheduleRepo extends JpaRepository<Course_Schedule,Integer> {

}
