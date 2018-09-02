package lab.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lab.db.model.Employee;
import lab.db.service.IEmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService empService;

    @RequestMapping("/employees")
    public String findEmployees(Model model) {

        List<Employee> employees = (List<Employee>) empService.findAll();

        model.addAttribute("employees", employees);

        return "listEmployees";
    }
}