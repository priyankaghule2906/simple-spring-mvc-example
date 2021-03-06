package com.priya.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.priya.springmvc.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
public class EmployeeController {

	@Autowired
	EmployeeManager employeeManager;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model){
		model.addAttribute("employees", employeeManager.getAllEmployees());
		return "employeesListDisplay";
	}
	
}
