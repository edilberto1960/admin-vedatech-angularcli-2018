package com.vedatech.admin.service.supplierservice;

import com.vedatech.admin.dao.customerdao.CustomerDao;
import com.vedatech.admin.dao.supplierdao.SupplierDao;
import com.vedatech.admin.model.customermodel.CustomerAccount;
import com.vedatech.admin.model.suppliermodel.SupplierAccount;
import com.vedatech.admin.service.customerservice.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SupplierAccountServiceImp implements SupplierAccountService {

    @Autowired
    SupplierDao supplierDao;

    @Override
    @Transactional
    public List<SupplierAccount> findAll() {
        return (List<SupplierAccount>) supplierDao.findAll();
    }
}
