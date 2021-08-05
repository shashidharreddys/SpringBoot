package com.MyFirstApp.SpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyFirstApp.SpringBootApp.entity.Department;

@Repository
public interface DepartmentRepoInterface extends JpaRepository<Department, Long> {

}
