package lk.ijse.gdse66.spring.repo;

import lk.ijse.gdse66.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, String> {


}

