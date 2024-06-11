package employee.employee.backend.service;

import employee.employee.backend.model.Employee;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface EmployeeService extends  GeneralService <Employee ,Number>{
    Page<Employee> findAllByNameContainsIgnoreCaseOrId (String key , Pageable pageable);

    Page<Employee> findAllByUsernameContainsIgnoreCaseOrId(String key, Pageable pageable);

    Page<Employee> findAllByUsernameContainsIgnoreCaseOrId(String key, org.springframework.data.domain.Pageable pageable);
}
