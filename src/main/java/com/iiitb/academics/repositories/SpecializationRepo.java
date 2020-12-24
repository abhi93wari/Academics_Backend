package com.iiitb.academics.repositories;

import com.iiitb.academics.bean.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepo extends JpaRepository<Specialization,Integer> {
}
