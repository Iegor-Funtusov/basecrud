package ua.com.alevel.basecrud.service;

import ua.com.alevel.basecrud.model.Employee;

import java.util.List;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:06 PM
 */

public interface EmployeeService {

    void save(Employee employee);
    List<Employee> findAll();
}
