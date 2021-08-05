package com.MyFirstApp.SpringBootApp.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyFirstApp.SpringBootApp.entity.Department;
import com.MyFirstApp.SpringBootApp.service.DepartmentServiceInterface;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceInterface DeptService;
	
	@PostMapping("/departments")
	public Department saveDept(@RequestBody Department dept) {
		
		return DeptService.saveDept(dept);
	}

	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return DeptService.getDepts();
	}
	
}
