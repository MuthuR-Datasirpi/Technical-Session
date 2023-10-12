package com.Project.SpringCrud.controller;

import com.Project.SpringCrud.DTO.CustomerDTO;
import com.Project.SpringCrud.DTO.CustomerSaveDTO;
import com.Project.SpringCrud.DTO.CustomerUpdateDTO;
import com.Project.SpringCrud.Entity.Customer;
import com.Project.SpringCrud.Repository.CustomerRepo;
import com.Project.SpringCrud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.* ;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController
{ @Autowired
private CustomerService customerService;
@PostMapping(path="/insert")
public  String saveCustomer(@RequestBody CustomerSaveDTO customersaveDTO)
{
    String id=customerService.addCustomer(customersaveDTO);
    return id;
}
@GetMapping(path="/select")
public List<CustomerDTO> getCustomer()
{
    List<CustomerDTO> Data=customerService.getCustomerData]();
    return Data;
}
}
