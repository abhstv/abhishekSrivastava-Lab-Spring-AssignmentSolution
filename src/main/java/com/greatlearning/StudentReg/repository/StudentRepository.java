package com.greatlearning.StudentReg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentReg.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
