package lab.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.db.model.Employee;
import lab.db.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = (List<Employee>) repository.findAll();
        return employees;
    }

}