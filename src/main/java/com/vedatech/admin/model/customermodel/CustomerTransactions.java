package com.vedatech.admin.model.customermodel;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "customer_transactions")
public class CustomerTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    //@Temporal(TemporalType.DATE)
    //@DateTimeFormat(pattern = "yyyy-MM-dd" )
    private Date date;


    @Column(name = "operationDate")
    //@Temporal(TemporalType.DATE)
    //@DateTimeFormat(pattern = "yyyy-MM-dd" )
    private Date operationDate;

    //@Size(min= 2, max = 25)
    private String reference;

    private String description;

    private String expandedTo;

    private String status;

    @NumberFormat(style = Style.CURRENCY)
    private double depositAmount;

    @NumberFormat(style = Style.CURRENCY)
    private double checkAmount;

    private Double Balance;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private CustomerAccount customerAccount;

   /* @ManyToOne
    @JoinColumn(name = "id_accounts")
    private Accounts accounts;*/


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Date getOperationDate() {
        return operationDate;
    }


    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }


    public String getReference() {
        return reference;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getExpandedTo() {
        return expandedTo;
    }


    public void setExpandedTo(String expandedTo) {
        this.expandedTo = expandedTo;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public double getDepositAmount() {
        return depositAmount;
    }


    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }


    public double getCheckAmount() {
        return checkAmount;
    }


    public void setCheckAmount(double checkAmount) {
        this.checkAmount = checkAmount;
    }


    public Double getBalance() {
        return Balance;
    }


    public void setBalance(Double balance) {
        Balance = balance;
    }

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }


   /* public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }*/

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", date=" + date +
                ", operationDate=" + operationDate +
                ", reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                ", expandedTo='" + expandedTo + '\'' +
                ", status='" + status + '\'' +
                ", depositAmount=" + depositAmount +
                ", checkAmount=" + checkAmount +
                ", Balance=" + Balance +
                ", customerAccoutn=" + checkAmount +
//                ", accounts=" + accounts +
                '}';
    }
}
