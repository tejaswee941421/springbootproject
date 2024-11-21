package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Employee;
import com.example.SpringMongoProject.Service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping(value = "/save")
    private String saveEmployee(@RequestBody Employee employees) {

        employeeServices.saveorUpdate(employees);
        return employees.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Employee> getEmployee() {
        return employeeServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Employee update(@RequestBody Employee employee, @PathVariable(name = "id") String _id) {
       employee.set_id(_id);
        employeeServices.saveorUpdate(employee);
        return employee;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteEmployee(@PathVariable("id") String _id) {
        employeeServices.deleteEmployee(_id);
    }


    @RequestMapping("/search/{id}")
    private Employee getEmployee(@PathVariable(name = "id") String employeeid) {
        return employeeServices.getEmployeeByID(employeeid);
    }

}