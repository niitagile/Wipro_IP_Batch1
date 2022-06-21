package com.example.demo.controller;
import java.util.HashMap;
import java.util.List;
import com.example.demo.repository.*;
import com.example.demo.model.*;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employees")
    public List < Employee > getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity < Employee > getEmployeeById(
        @PathVariable(value = "id") Integer employeeId) throws ResourceNotFoundException {
    
    	
    	Employee user=employeeRepository.findById(employeeId)
    			.orElseThrow(()->new ResourceNotFoundException("Employee not found::"+employeeId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity < Employee > updateEmployee(
        @PathVariable(value = "id") Integer employeeId,
        @Valid @RequestBody Employee userDetails) throws ResourceNotFoundException {
    	Employee user=employeeRepository.findById(employeeId)
    			.orElseThrow(()->new ResourceNotFoundException("Employee not found::"+employeeId));
        user.setEmail(userDetails.getEmail());
        final Employee updatedUser = employeeRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/employees/{id}")
    public Map < String, Boolean > deleteUser(
        @PathVariable(value = "id") Integer employeeId) throws ResourceNotFoundException {
    	Employee user=employeeRepository.findById(employeeId)
    			.orElseThrow(()->new ResourceNotFoundException("Employee not found::"+employeeId));

        employeeRepository.delete(user);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}