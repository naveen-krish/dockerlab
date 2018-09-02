package lab.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.db.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}