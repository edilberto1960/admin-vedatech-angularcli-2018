package com.vedatech.admin.model.suppliermodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vedatech.admin.model.customermodel.CustomerTransactions;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "supplier_account")
public class SupplierAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_supplier")
    private Long id;

    // @NotEmpty
    @Column(name = "name_supplier")
    private String nameSupplier;

    // @NotBlank
    @Column(name = "account_number")
    private Long accountNumber;

    // @NotNull
    @Column(name = "create_at")
    //@Temporal(TemporalType.DATE)
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createAt;

    //@NotBlank
    //@Email
    @Column(name = "email")
    private String email;

    //@NotBlank
    @Column(name = "phone")
    private String phone;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "supplierAccount")
    //@JoinColumn(name="ID_BANK", nullable=false)
    private List<SupplierTransactions> supplierTransactions;

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<SupplierTransactions> getSupplierTransactions() {
        return supplierTransactions;
    }

    public void setSupplierTransactions(List<SupplierTransactions> supplierTransactions) {
        this.supplierTransactions = supplierTransactions;
    }
}
