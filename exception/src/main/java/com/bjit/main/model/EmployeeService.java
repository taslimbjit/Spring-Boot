package com.bjit.main.model;

import com.bjit.main.entity.Employee;
import com.bjit.main.exceptions.NoDataFoundException;
import com.bjit.main.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1, "Employee 1", 28, "BJIT"));
        list.add(new Employee(2, "Employee 2", 29, "BJIT"));
        list.add(new Employee(3, "Employee 3", 30, "BJIT"));
        list.add(new Employee(4, "Employee 4", 43, "BJIT"));
        list.add(new Employee(5, "Employee 5", 55, "BJIT"));
    }

    public List<Employee> getList () {
        if (list.size() > 0) {
            return list;
        }
        throw new NoDataFoundException("No employees available");
    }

    public Employee getEmployee (Integer id) {
        Optional<Employee> theEmployee = list.stream().filter(e -> e.getId() == id).findFirst();
        if (!theEmployee.isPresent()) {
            throw new ResourceNotFoundException("Employee not found for the id->"+id);
        }
        return theEmployee.get();
    }
}
