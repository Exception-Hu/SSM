package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.mapper.StudentMapper;
import com.shop.po.Student;
import com.shop.po.StudentExample;
import com.shop.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> getStudentList() {
		StudentExample example = new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);
		
		return list;
	}

}
