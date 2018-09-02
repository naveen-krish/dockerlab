package lab.db.service;

import java.util.List;

import lab.db.model.Employee;

public interface IEmployeeService {
    public List<Employee> findAll();

}