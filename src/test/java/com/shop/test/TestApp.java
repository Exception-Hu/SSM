package com.shop.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.mapper.StudentMapper;
import com.shop.po.Student;

public class TestApp {
	@Test
	public void test() {
		ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("appcationContext-dao.xml");
		StudentMapper studentMapper = ca.getBean(StudentMapper.class);
		Student student = studentMapper.selectByPrimaryKey("0001");
		System.out.println(student);
		ca.close();
		
	}
	
	@Test
	public void testApp() throws SQLException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("appcationContext-dao.xml");

    BasicDataSource ds = ac.getBean("dataSource", BasicDataSource.class);

    Connection conn = ds.getConnection();
    System.out.println(conn);

    ac.close();
	}

}
