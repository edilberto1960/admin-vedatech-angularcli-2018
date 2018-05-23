package com.vedatech.admin.service.bankservice;

import com.vedatech.admin.dao.bankdao.BankDao;
import com.vedatech.admin.model.bankmodel.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BankAccountServiceImp implements BankAccountService {

    @Autowired
    BankDao bankDao;

    @Override
    @Transactional
    public List<BankAccount> findAll() {
        return (List<BankAccount>) bankDao.findAll();
    }
}
