package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.DTO.EmployeeDTO;
import com.Project.SpringCrud.Entity.Employee;
import com.Project.SpringCrud.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;

    /**
     *
     * @param employeeDTO
     * @return
     */
    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee= new employee(
                employeeDTO.getemployeename(),
                employeeDTO.getemployeeaddress(),
                employeeDTO.getMobile()
        );
        employeeRepo.save(employee);
        return employee;    }


    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public Page<employee> getemployeeData(int x, int y) {
           Page<employee> cd = employeeRepo.findAll(PageRequest.of(x,y));
           return  cd;
    }

//    @Override
//    public String Updateemployee(employeeUpdateDTO employeeUpdateDTO) {
//        if(employeeRepo.existsById(employeeUpdateDTO.getemployeeid()))
//        {
//            employee employee = new employee();
//        }
//    }
}
