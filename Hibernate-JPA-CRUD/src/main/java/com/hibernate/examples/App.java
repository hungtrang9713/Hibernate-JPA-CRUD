package com.hibernate.examples;

import java.util.List;

import com.hibernate.examples.dao.StudentDAO;
import com.hibernate.examples.dao.impl.StudentDAOImpl;
import com.hibernate.examples.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDAO studentDAO = new StudentDAOImpl();
        
        Student student = new Student();
        student.setName("Nguyen Van C");
        student.setAge(24);
//        
        studentDAO.insert(student);
//        
//        System.out.println("Inserted student successful");
        
        List<Student> listStudents = studentDAO.getListStudentByAge(24);
        
        for(Student student2 : listStudents){
        	System.out.println("name = "+student2.getName());
        }
    }
}
