package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.po.Student;
import com.shop.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("test.do")
	public List<Student> getStudentList(){
		List<Student> result = studentService.getStudentList();
		return result;
	}
	
	@RequestMapping("list.do")
	public String testDo() {
		System.out.println("StudentController.testDo()");
		return "test";
	}
	
}
