package Inheritance;

import java.util.Date;

public class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    public Account(String accNo, String name, String address, String phno, String dob, long balance) {
        this.accNo=accNo;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.dob=dob;
        this.balance=balance;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}

    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }

    public static void main(String[] args) {
    }
}

class SavingsAccount extends Account{
    public SavingsAccount(String accNo, String name, String address, String phno, String dob, long balance) {
        super(accNo, name, address, phno, dob, balance);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }

    public void fixedDeposit() {

    }

    public void liquidate() {

    }
}

class LoanAccount extends Account {

    public LoanAccount(String accNo, String name, String address, String PhoneNo, String dob, long balance) {
        super(accNo, name, address, PhoneNo, dob, balance);
    }

    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }

    public void topUpLoan() {

    }
}

