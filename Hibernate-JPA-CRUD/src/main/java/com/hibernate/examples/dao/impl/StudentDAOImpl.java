package com.hibernate.examples.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hibernate.examples.dao.StudentDAO;
import com.hibernate.examples.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	
	@PersistenceContext
	private static EntityManager em;
	
	public StudentDAOImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
		em = emf.createEntityManager();
	}

	public void insert(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
	}

	public void save(Student student) {
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
	}

	public void delete(Integer id) {
		em.getTransaction().begin();
		Student student = getStudentById(id);
		if(student != null)
			em.remove(student);
		em.getTransaction().commit();
	}

	public List<Student> getListAllStudent() {
		TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s",
                Student.class);
        return query.getResultList();
	}

	public Student getStudentById(Integer id) {
		return em.find(Student.class, id);
	}

	public List<Student> getListStudentByAge(Integer age) {
		TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE s.age = :age",
                Student.class);
		query.setParameter("age", age);
        return query.getResultList();
	}

}
