package ua.com.alevel.basecrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.alevel.basecrud.model.Employee;
import ua.com.alevel.basecrud.service.EmployeeService;

/**
 * @author Iehor Funtusov, created 06/11/2020 - 8:09 PM
 */

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String allEmployees(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employees";
    }

    @GetMapping("/new")
    public String newEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "new_employee";
    }

    @PostMapping
    public String createEmployee(Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees";
    }
}
