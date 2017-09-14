package com.priya.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.springmvc.dao.EmployeeDAO;
import com.priya.springmvc.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	@Override
	public List<EmployeeVO> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

}
