package employee.employee.backend.service.impl;

import employee.employee.backend.model.Employee;
import employee.employee.backend.repository.EmployeeRepository;
import employee.employee.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllByNameContainsIgnoreCaseOrId(String key, java.awt.print.Pageable pageable) {
        return null;
    }

    @Override
    public Page<Employee> findAllByUsernameContainsIgnoreCaseOrId(String key, java.awt.print.Pageable pageable) {
        return null;
    }

    @Override
    public Page<Employee> getAll(org.springframework.data.domain.Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee create(Employee data  ) {
        return employeeRepository.save(data);
    }

    @Override
    public Employee update(Employee data) {
        return  employeeRepository.save(data);
    }

    @Override
    public void delete(Employee data) {
employeeRepository.delete(data);
    }

    @Override
    public void deleteById(Long id) {
employeeRepository.deleteById(id);
    }
       @Override
    public Page<Employee> findAllByUsernameContainsIgnoreCaseOrId(String key, Pageable pageable) {
        try {
            Long n=Long.parseLong(key);
            int i=Integer.parseInt(key);
            return employeeRepository.findAlByUsernameContainsIgnoreCaseOrId(key , n, pageable);
        } catch (Exception e){
            return employeeRepository.findAlByUsernameContainsIgnoreCaseOrId(key, (long) -1, pageable);
        }
       }


}
