package com.greatlearning.StudentReg.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.greatlearning.StudentReg.entity.Student;

@Component
public interface StudentService {

	public List<Student> FindAll();

	public Student FindById(int id);

	public void save(Student theStudent);

	public void DeleteById(int id);

}
