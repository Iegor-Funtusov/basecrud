package ua.com.alevel.basecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.alevel.basecrud.model.Employee;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:04 PM
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
