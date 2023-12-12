package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.EmployeeDTO;
import com.Project.SpringCrud.DTO.EmployeeSaveDTO;
import com.Project.SpringCrud.Entity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {



    Employee addEmployee(EmployeeDTO employeeDTO);

    Page<Employee> getEmployeeData(int x, int y);

    Page<Employee> getemployeeData(int x, int y);

//    String UpdateEmployee(EmployeeUpdateDTO employeeUpdateDTO);
}
