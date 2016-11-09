package com.hibernate.examples;

import junit.framework.TestCase;

import com.hibernate.examples.dao.StudentDAO;
import com.hibernate.examples.dao.impl.StudentDAOImpl;
import com.hibernate.examples.entity.Student;

public class StudentDAOImplTestcase extends TestCase {
	
	StudentDAO studentDao = null;

	public StudentDAOImplTestcase(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		studentDao = new StudentDAOImpl();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testInsert() {
		Student student = new Student();
		student.setName("Nguyen Van A");
		student.setAge(25);
		
		studentDao.insert(student);
	}

	public void testSave() {
		fail("Not yet implemented");
	}

	public void testDelete() {
		fail("Not yet implemented");
	}

	public void testGetListAllStudent() {
		fail("Not yet implemented");
	}

	public void testGetStudentById() {
		fail("Not yet implemented");
	}

	public void testGetListStudentByAge() {
		fail("Not yet implemented");
	}

}
