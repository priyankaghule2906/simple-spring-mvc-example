package com.priya.springmvc.dao;

import java.util.List;
import com.priya.springmvc.model.EmployeeVO;

public interface EmployeeDAO {

	public List<EmployeeVO> getAllEmployees();
}
