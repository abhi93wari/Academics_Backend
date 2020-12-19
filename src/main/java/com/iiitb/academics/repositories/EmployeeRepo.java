package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employees,Integer> {
}
