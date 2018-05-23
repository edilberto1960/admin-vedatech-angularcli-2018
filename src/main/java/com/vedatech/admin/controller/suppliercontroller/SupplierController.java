package com.vedatech.admin.controller.suppliercontroller;


import com.vedatech.admin.model.suppliermodel.SupplierAccount;
import com.vedatech.admin.service.supplierservice.SupplierAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierAccountService  supplierAccountService;

    @GetMapping("/list")
    public List<SupplierAccount> getListBank() {

        return supplierAccountService.findAll();
    }
}
