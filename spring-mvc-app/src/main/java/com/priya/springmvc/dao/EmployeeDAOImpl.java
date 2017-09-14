package com.priya.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.priya.springmvc.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<EmployeeVO> getAllEmployees() {

		List <EmployeeVO> employees = new ArrayList<>();
		
		EmployeeVO e1 = new EmployeeVO();
		e1.setId(1);
		e1.setFirstName("Bimal");
		e1.setLastName("Singh");
		
		EmployeeVO e2 = new EmployeeVO();
		e2.setId(2);
		e2.setFirstName("Priyanka");
		e2.setLastName("Ghule");
		
		employees.add(e1);
		employees.add(e2);
		
		
		return employees;
	}

}
