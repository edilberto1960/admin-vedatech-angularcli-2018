package com.vedatech.admin.service.customerservice;

import com.vedatech.admin.dao.customerdao.CustomerDao;
import com.vedatech.admin.model.customermodel.CustomerAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerAccountServiceImp implements CustomerAccountService {

    @Autowired
    CustomerDao customerDao;

    @Override
    @Transactional
    public List<CustomerAccount> findAll() {
        return (List<CustomerAccount>) customerDao.findAll();
    }
}
