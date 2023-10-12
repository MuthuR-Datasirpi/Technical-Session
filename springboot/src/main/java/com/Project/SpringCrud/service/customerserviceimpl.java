package com.Project.SpringCrud.Service;

import com.Project.SpringCrud.Entity.customer;
import com.Project.SpringCrud.dto.customerdto;
import com.Project.SpringCrud.dto.customersavedto;
import com.Project.SpringCrud.repository.customerrepo;
import com.Project.SpringCrud.dto.customerupdatedto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class customerserviceimpl implements customerservice{
    @Autowired
    private customerrepo customerRepo;

    @Override
    public String addCustomer(customersavedto customerSaveDTO) {
        customer customer= new customer(
                customerSaveDTO.getName(),
                customerSaveDTO.getAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return "Inserted Sucessfully..";
    }

    @Override
    public List<customerdto> getCustomerData() {
        List<customer>customersData= customerRepo.findAll();
        List<customerdto> customerDTOList= new ArrayList<>();
        for (customer a:customersData) {
            customerdto customerDTO = new customerdto(
              a.getCustomerid(),
              a.getCustomername(),
              a.getCustomeraddress(),
              a.getMobile()
            );
            customerDTOList.add(customerDTO);
        }
        return  customerDTOList;
    }

//    @Override
//    public String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO) {
//        if(customerRepo.existsById(customerUpdateDTO.getCustomerid()))
//        {
//            Customer customer = new Customer();
//        }
//    }
}
