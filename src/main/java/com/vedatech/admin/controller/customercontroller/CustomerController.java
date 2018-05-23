package com.vedatech.admin.controller.customercontroller;



import com.vedatech.admin.model.customermodel.CustomerAccount;
import com.vedatech.admin.service.customerservice.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerAccountService customerAccountService;

    @GetMapping("/list")
    public List<CustomerAccount> getListBank() {

        return customerAccountService.findAll();
    }
}
