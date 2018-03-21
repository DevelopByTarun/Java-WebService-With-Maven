package com.server.code.service;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.server.code.connection.HibernateUtil;
import com.server.code.dto.EmployeePersistentDTO;

public class EmployeeService {
	
	public static int addEmp(EmployeePersistentDTO epd) {
		EmployeePersistentDTO epDTO = null;
		Session session = null;
		Transaction tx = null;
		int status = 0;
		
		epDTO = new EmployeePersistentDTO();
		epDTO.setName(epd.getName());
		epDTO.setSalary(epd.getSalary());
		
		// open and get connection
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			status = (Integer) session.save(epDTO);
			tx.commit();
		}
		catch(HibernateException he) {
			if(tx != null) {
				tx.rollback();
			}
			he.printStackTrace();
		}
		finally {
			session.close();
		}
		return status;
	}
	
	@SuppressWarnings({ "rawtypes"})
	public static int updateEmp(EmployeePersistentDTO epDTO) {
		Session session = null;
		Transaction tx = null;
		int status = 0;
		
		// open and get connection
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			Query query = session.getNamedQuery("forUpdate");
			query.setParameter("name", epDTO.getName());
			query.setParameter("salary", epDTO.getSalary());
			query.setParameter("id", epDTO.getId());
			status = query.executeUpdate();
			tx.commit();
		}
		catch(HibernateException he) {
			if(tx != null) {
				tx.rollback();
			}
			he.printStackTrace();
		}
		finally {
			session.close();
		}
		return status;
	}
	
	@SuppressWarnings("rawtypes")
	public static int deleteEmp(int id) {
		Session session = null;
		Transaction tx = null;
		int status = 0;
		
		// open and get connection
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			tx = session.beginTransaction();
			Query query = session.getNamedQuery("forDelete");
			query.setParameter("id", id);
			status = query.executeUpdate();
			tx.commit();
		}
		catch(HibernateException he) {
			if(tx != null) {
				tx.rollback();
			}
			he.printStackTrace();
		}
		finally {
			session.close();
		}
		return status;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<EmployeePersistentDTO> getAllEmp() {
		ArrayList<EmployeePersistentDTO> empList = null;
		Session session = null;
		
		// open and get connection
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query = session.getNamedQuery("forSelectAll");
			empList = (ArrayList<EmployeePersistentDTO>) query.list();
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			session.close();
		}
		return empList;
	}
	
	@SuppressWarnings("rawtypes")
	public static EmployeePersistentDTO getEmpById(int id) {
		EmployeePersistentDTO employee = null;
		Session session = null;
		
		// open and get connection
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query = session.getNamedQuery("forEmployeeById");
			query.setParameter("id", id);
			employee = (EmployeePersistentDTO) query.uniqueResult();
		}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			session.close();
		}
		return employee;
	}
}
