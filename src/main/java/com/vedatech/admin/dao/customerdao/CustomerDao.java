package com.vedatech.admin.dao.customerdao;


import com.vedatech.admin.model.customermodel.CustomerAccount;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<CustomerAccount, Long> {
}
