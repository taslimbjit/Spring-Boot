package com.bjit.main.controller;

import com.bjit.main.entity.Employee;
import com.bjit.main.model.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired

    EmployeeService eService;

    @GetMapping("/employees")
    public List<Employee> getList () {
        return eService.getList();
    }

    @GetMapping("/employees/{id}")
    public Employee get (@PathVariable Integer id) {
        return eService.getEmployee(id);
    }
}
