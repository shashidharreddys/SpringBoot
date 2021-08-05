package com.MyFirstApp.SpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyFirstApp.SpringBootApp.entity.Department;
import com.MyFirstApp.SpringBootApp.repository.DepartmentRepoInterface;

@Service
public class DepratmentServiceImpl implements DepartmentServiceInterface {

	@Autowired
	private DepartmentRepoInterface DeptRepo;
	
public Department saveDept(Department dept) {
		return DeptRepo.save(dept);
	}

@Override
public List<Department> getDepts() {
	// TODO Auto-generated method stub
	return DeptRepo.findAll();
}
}
