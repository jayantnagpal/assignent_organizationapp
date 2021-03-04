package com.assignment.organizationdemo.service;

import java.awt.print.Book;

import com.ymsli.companyapp.dao.Department;
import com.ymsli.companyapp.dao.Employee;
import com.ymsli.companyapp.dao.Project;

public interface CompanyService {
	public Iterable<Department> getAllDepartments();

	public Department getDepartmentByName(String dname);

	public Iterable<Employee> getAllEmployeesFromDepartment(String dname);

	public Iterable<Project> getEmployeeProjects(String name);
}