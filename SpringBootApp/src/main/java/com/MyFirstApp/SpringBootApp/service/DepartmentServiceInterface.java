package com.MyFirstApp.SpringBootApp.service;

import java.util.List;

import com.MyFirstApp.SpringBootApp.entity.Department;

public interface DepartmentServiceInterface {
 
	public Department saveDept(Department dept);

	public List<Department> getDepts();
}
