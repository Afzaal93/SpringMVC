package com.afzaal.SpringMVC.Dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.afzaal.SpringMVC.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(Employee employee) {
		Integer save = (Integer) this.hibernateTemplate.save(employee);
		return save;
	}

	public List<Employee> read(Employee employee) {

		return this.hibernateTemplate.loadAll(Employee.class);
	}

	public Employee readone(int id) {
		return this.hibernateTemplate.load(Employee.class, id);
	}

	/*
	 * @Transactional public int update(int id, String city) { Integer save =
	 * (Integer) this.hibernateTemplate.save(load); return save; }
	 */

}
