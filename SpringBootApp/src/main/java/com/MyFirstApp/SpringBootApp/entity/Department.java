package com.MyFirstApp.SpringBootApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long DeptId;
	private String DeptName;
	private String DeptAddr;
	private String DeptCode;

	public long getDeptId() {
		return DeptId;
	}

	public void setDeptId(long deptId) {
		DeptId = deptId;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public String getDeptAddr() {
		return DeptAddr;
	}

	public void setDeptAddr(String deptAddr) {
		DeptAddr = deptAddr;
	}

	public String getDeptCode() {
		return DeptCode;
	}

	public void setDeptCode(String deptCode) {
		DeptCode = deptCode;
	}

	public Department(long deptId, String deptName, String deptAddr, String deptCode) {
		super();
		DeptId = deptId;
		DeptName = deptName;
		DeptAddr = deptAddr;
		DeptCode = deptCode;
	}

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", DeptName=" + DeptName + ", DeptAddr=" + DeptAddr + ", DeptCode="
				+ DeptCode + "]";
	}

}
