package employee.employee.backend.Controller;

import employee.employee.backend.model.Employee;
import employee.employee.backend.repository.EmployeeRepository;
import employee.employee.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin( origins = "*", maxAge = 3600)
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/employee/get")
    public Page<Employee> getAll(@RequestParam(required = false)String key, Pageable pageable) {
        if(key==null) key="";
        return employeeService.getAll(pageable);

    }
    @PostMapping("/employee/create")
    public Employee create (@RequestBody Employee employee) {

    return  employeeService.create(employee);
    }
    @PutMapping("/employee/put")
    public Employee update(@RequestBody Employee employee) {
        return  employeeService.update(employee);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         employeeService.deleteById(id);
    }

}
