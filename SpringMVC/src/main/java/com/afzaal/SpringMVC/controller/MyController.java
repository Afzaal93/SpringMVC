package com.afzaal.SpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.afzaal.SpringMVC.Employee;
import com.afzaal.SpringMVC.DaoImpl.EmployeeImpl;

@Controller
public class MyController {
	@Autowired
	private EmployeeImpl impl;

	@RequestMapping("create")
	public String create() {
		return "create";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute Employee employee, Model model) {
		this.impl.save(employee);
		model.addAttribute("create", employee);
		return "sucessfull";
	}

	@RequestMapping(value = "read", method = RequestMethod.GET)
	public String read(@ModelAttribute Employee employee, Model model) {
		List<Employee> read = this.impl.read(employee);
		model.addAttribute("read", read);

		return "sucessfull";
	}

	@RequestMapping(value = "readone", method = RequestMethod.GET)
	public String readone(@RequestParam("id") int id, Model model) {
		Employee employeone = this.impl.readone(id);
		System.out.println("hi" + employeone);
		model.addAttribute("one", employeone);
		return "sucessfull";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String Update(@RequestParam("id") int id, @ModelAttribute Employee employee, Model model) {
		Employee readone = this.impl.readone(id);
		this.impl.save(readone);
		model.addAttribute("update",employee);
		return "sucessfull";
	}

}
