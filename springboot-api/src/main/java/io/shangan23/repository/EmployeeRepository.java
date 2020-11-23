package io.shangan23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.shangan23.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
