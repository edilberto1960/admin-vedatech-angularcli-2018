package com.vedatech.admin.controller.bankcontroller;


import com.vedatech.admin.model.bankmodel.BankAccount;
import com.vedatech.admin.service.bankservice.BankAccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

        @Autowired
        BankAccountServiceImp bankAccountService;

        @GetMapping("/list")
        public List<BankAccount> getListBank() {

            return bankAccountService.findAll();
        }
}
