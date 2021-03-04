package com.assignment.organizationdemo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ymsli.companyapp.dao.Employee;

 
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

 


 
 

 

