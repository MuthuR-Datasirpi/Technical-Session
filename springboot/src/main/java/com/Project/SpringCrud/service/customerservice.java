package com.Project.SpringCrud.Service;

import java.util.List;

import com.Project.SpringCrud.dto.customerdto;
import com.Project.SpringCrud.dto.customersavedto;
import com.Project.SpringCrud.dto.CustomerUpdateDTO;

public interface customerservice {

    String addCustomer(customersavedto customerSaveDTO);

    List<customerdto> getCustomerData();

//    String UpdateCustomer(CustomerUpdateDTO customerUpdateDTO);
}
