package com.vedatech.admin.dao.supplierdao;


import com.vedatech.admin.model.customermodel.CustomerAccount;
import com.vedatech.admin.model.suppliermodel.SupplierAccount;
import org.springframework.data.repository.CrudRepository;

public interface SupplierDao extends CrudRepository<SupplierAccount, Long> {
}
