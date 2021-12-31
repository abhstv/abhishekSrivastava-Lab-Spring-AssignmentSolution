package com.greatlearning.StudentReg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.StudentReg.entity.Student;
import com.greatlearning.StudentReg.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> FindAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student FindById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student theStudent) {
		studentRepository.save(theStudent);
	}

	@Override
	public void DeleteById(int id) {
		studentRepository.deleteById(id);
	}

}
