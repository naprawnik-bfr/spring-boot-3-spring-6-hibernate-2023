package com.naprawnikbfr.demo.dao;

import com.naprawnikbfr.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {         //<Entity type, Primary key>
}
