package com.greatlearning.StudentReg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.greatlearning.StudentReg.repository.StudentRepository;
import com.greatlearning.StudentReg.entity.Student;

@SpringBootApplication
public class StudentRegApplication {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentRegApplication.class, args);
	}

	@Bean
	public void createEntries() {

		Student s1 = new Student(1, "Suresh", "B.Tech", "India");
		studentRepository.save(s1);
		Student s2 = new Student(2, "Muri", "B.Arch", "Canada");
		studentRepository.save(s2);
		Student s3 = new Student(3, "Daniel", "B.Tech", "New Zealand");
		studentRepository.save(s3);
		Student s4 = new Student(4, "Tanya", "B.Com", "USA");
		studentRepository.save(s4);
	}

}
