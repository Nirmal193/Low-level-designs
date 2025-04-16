package org.example.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Accounts {
    private Long accountId;
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private BigDecimal balance;
    private String branchCode;
    private String currency;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdated;
    private boolean isActive;
    private String email;
    private String phoneNumber;
    private String address;

    // Constructor
    public Accounts(Long accountId, String accountNumber, String accountHolderName, String accountType,
                   BigDecimal balance, String branchCode, String currency) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.branchCode = branchCode;
        this.currency = currency;
        this.createdDate = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
        this.isActive = true;
    }

    // Getters and Setters
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
        this.lastUpdated = LocalDateTime.now();
    }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public LocalDateTime getCreatedDate() { return createdDate; }

    public LocalDateTime getLastUpdated() { return lastUpdated; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }


}
