package employee.employee.backend.repository;

import employee.employee.backend.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    List<Employee> findByPublished (boolean published);
//    List<Employee> findByUsernameContaining(String username);

Page<Employee> findAlByUsernameContainsIgnoreCaseOrId(String key , Long id ,Pageable pageable);

}
