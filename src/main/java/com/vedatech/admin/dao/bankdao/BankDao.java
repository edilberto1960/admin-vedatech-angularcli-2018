package com.vedatech.admin.dao.bankdao;

import com.vedatech.admin.model.bankmodel.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankDao extends CrudRepository<BankAccount, Long> {
}
