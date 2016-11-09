package com.hibernate.examples.dao;

import java.util.List;

import com.hibernate.examples.entity.Student;

public interface StudentDAO {
	
	public void insert(Student student);
	
	public void save(Student student);
	
	public void delete(Integer id);
	
	public List<Student> getListAllStudent();
	
	public Student getStudentById(Integer id);
	
	public List<Student> getListStudentByAge(Integer age);

}
