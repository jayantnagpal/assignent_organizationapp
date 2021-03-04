package com.assignment.organizationdemo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment.organizationdemo.dao.Department;
import com.assignment.organizationdemo.dao.Employee;
import com.assignment.organizationdemo.dao.Project;
import com.assignment.organizationdemo.repos.DepartmentRepository;
import com.assignment.organizationdemo.repos.EmployeeRepository;
import com.assignment.organizationdemo.repos.ProjectRepository;

public class CompanyServiceImpl implements CompanyService {

	private DepartmentRepository departmentRepo;
	private EmployeeRepository employeeRepo;
	private ProjectRepository projectRepo;

	@Autowired
    public CompanyServiceImpl(DepartmentRepository departmentRepo, EmployeeRepository employeeRepo,ProjectRepository projectRepo) {
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
        this.projectRepo = projectRepo;
    }

//	@MyLogger
//	@Override
	public Iterable<Department> getAllDepartments() {
		return departmentRepo.findAll();

	}

//	@Cacheable(value = "mycache", key = "#bookId")
//	@Override
	public Department getDepartmentByName(String dname) {
		return null;
				
	}

	@Override
	public Iterable<Employee> getAllEmployeesFromDepartment(String dname) {
		
		return null;
	}

	@Override
	public Iterable<Project> getEmployeeProjects(String name) {
		
		return null;
	}
}