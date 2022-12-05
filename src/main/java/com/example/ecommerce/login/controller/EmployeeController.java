package com.example.ecommerce.login.controller;

import com.example.ecommerce.login.exception.ResourceNotFoundException;
import com.example.ecommerce.login.model.Employee;
import com.example.ecommerce.login.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dangal_nirajan on 29/11/2022
 */
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    @PostMapping("/addEmployees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @GetMapping("/addEmployees/{id}")
    Employee getEmployeeById(@PathVariable Long id){
        return employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
    }

    @PutMapping("/addEmployees/{id}")
    Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return employeeRepo.findById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setLastName(newEmployee.getLastName());
                    employee.setEmailId(newEmployee.getEmailId());
                    return employeeRepo.save(employee);
                }).orElseThrow(()-> new ResourceNotFoundException(id));
    }

    @DeleteMapping("/addEmployees/{id}")
    String deleteEmployee(@PathVariable Long id){
        if(!employeeRepo.existsById(id)){
            throw new ResourceNotFoundException(id);
        }
        employeeRepo.deleteById(id);
        return "Employee with id "+id+ "has been deleted successfully"; 
    }
}
