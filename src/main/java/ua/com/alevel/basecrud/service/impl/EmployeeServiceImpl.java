package ua.com.alevel.basecrud.service.impl;

import org.springframework.stereotype.Service;
import ua.com.alevel.basecrud.model.Employee;
import ua.com.alevel.basecrud.repository.EmployeeRepository;
import ua.com.alevel.basecrud.service.EmployeeService;

import java.util.List;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:06 PM
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
