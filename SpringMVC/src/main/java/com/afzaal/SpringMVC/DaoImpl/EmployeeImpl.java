package com.afzaal.SpringMVC.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afzaal.SpringMVC.Employee;
import com.afzaal.SpringMVC.Dao.EmployeeDao;

@Service
public class EmployeeImpl {
	@Autowired
	private EmployeeDao dao;

	public int save(Employee employee) {
		int save = this.dao.save(employee);
		return save;
	}

	public List<Employee> read(Employee employee) {
		return this.dao.read(employee);
		
	}

	public Employee readone(int id) {
		return this.dao.readone(id);
		
	}

	/*
	 * public int update(int id, String city) { // TODO Auto-generated method stub
	 * return this.dao.update(id,city); }
	 */

}
