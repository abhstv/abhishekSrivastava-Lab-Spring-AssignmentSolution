package com.greatlearning.StudentReg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.StudentReg.entity.Student;
import com.greatlearning.StudentReg.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/")
	public String homePage() {
		return "redirect:/list";
	}

	@GetMapping("/list")
	public String StudentList(Model theModel) {
		List<Student> students = service.FindAll();
		theModel.addAttribute("Students", students);
		return "studentlist";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("Student", theStudent);
		return "registrationform";
	}

	@PostMapping("/save")
	public String save(Student student, @RequestParam int id) {
		student.setId(id);
		this.service.save(student);
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int theId) {
		service.DeleteById(theId);
		return "redirect:/list";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {
		Student theStudent = service.FindById(theId);
		theModel.addAttribute("Student", theStudent);
		return "registrationform";
	}

}
