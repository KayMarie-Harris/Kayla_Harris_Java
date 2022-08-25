package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    Customer(int id, String name, List<AccountRecord> charges)
    {
        this.id = id;
        this.name = name;
        this.charges = charges;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBalance()
    {
        int balance = 0;
        for(int chargeIndex = 0; chargeIndex < charges.size(); chargeIndex++)
        {
            AccountRecord currCharge = charges.get(chargeIndex);
            balance += currCharge.getCharge();
        }

        return balance;
    }

    public List<AccountRecord> getCharges()
    {
        return charges;
    }

    @Override
    public String toString()
    {
        String toString = "Customer ID: " + id;
        toString += " Customer Name: " + name;
        toString += " Balance: " + getBalance();

        return toString;
    }
}
