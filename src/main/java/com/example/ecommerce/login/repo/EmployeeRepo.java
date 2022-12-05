package com.example.ecommerce.login.repo;

import com.example.ecommerce.login.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dangal_nirajan on 29/11/2022
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
