package com.Project.SpringCrud.Controller;

import com.Project.SpringCrud.DTO.EmployeeDTO;
import com.Project.SpringCrud.Entity.Employee;
import com.Project.SpringCrud.Service.EmployeeService;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;

/**
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     *
     * @param employeeDTO
     * @return
     */
    @PostMapping(path = "/insert")
    public Employee saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        Employee Success = employeeService.addEmployee(employeeDTO);
        return Success;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    @GetMapping(path = "/select")
    public ResponseEntity<Object> getEmployee(@RequestParam int x, @RequestParam int y) {
        Page<Employee> Data = employeeService.getEmployeeData(x, y);
        return new ResponseEntity<Object>(Data.getContent(), HttpStatus.OK);
    }

}
