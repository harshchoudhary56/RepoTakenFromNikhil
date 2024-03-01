package com.liquibasePractical.practicalImplementation.repo;

import com.liquibasePractical.practicalImplementation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
