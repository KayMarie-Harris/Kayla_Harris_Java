package com.company;

import java.util.*;

public class Main
{
    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this

        List<String[]> cust1 = new ArrayList<>();
        List<String[]> cust2 = new ArrayList<>();
        List<String[]> cust3 = new ArrayList<>();

        for (int custDataIndex = 0; custDataIndex < customerData.size(); custDataIndex++) // Iterates through customerData
        {
            String[] currentCustData = customerData.get(custDataIndex);
            for (int currCustIndex = 0; currCustIndex < currentCustData.length; currCustIndex++) // Sorts customers into 3 diff lists
            {
                if (currentCustData[currCustIndex].equals("1")) {
                    cust1.add(currentCustData);
                } else if (currentCustData[currCustIndex].equals("2")) {
                    cust2.add(currentCustData);
                } else if (currentCustData[currCustIndex].equals("3")) {
                    cust3.add(currentCustData);
                }
            }
        }
        //Customer 1 Account Records
        //generating objects w/ loop concept source: https://www.codegrepper.com/code-examples/java/generate+objects+with+for+loop+java
        List<AccountRecord> cust1Records = new ArrayList<>();
        Customer customer1 = null;
        for (int cust1Index = 0; cust1Index < cust1.size(); cust1Index++) {
            String[] currentCustData = cust1.get(cust1Index);
            int currTransactionAmount = Integer.parseInt(currentCustData[2]);
            String currDate = currentCustData[3];
            cust1Records.add(cust1Index, new AccountRecord(currTransactionAmount, currDate));
            if (cust1Index == cust1.size() - 1) {
                customer1 = new Customer(Integer.parseInt(currentCustData[0]), currentCustData[1], cust1Records);
            }
        }
        //Customer 2 Account Records
        List<AccountRecord> cust2Records = new ArrayList<>();
        Customer customer2 = null;
        for (int cust2Index = 0; cust2Index < cust2.size(); cust2Index++) {
            String[] currentCustData = cust2.get(cust2Index);
            int currTransactionAmount = Integer.parseInt(currentCustData[2]);
            String currDate = currentCustData[3];
            cust2Records.add(cust2Index, new AccountRecord(currTransactionAmount, currDate));
            if (cust2Index == cust2.size() - 1) {
                customer2 = new Customer(Integer.parseInt(currentCustData[0]), currentCustData[1], cust2Records);
            }
        }

        //Customer 3 Account Records
        List<AccountRecord> cust3Records = new ArrayList<>();
        Customer customer3 = null;
        for (int cust3Index = 0; cust3Index < cust3.size(); cust3Index++) {
            String[] currentCustData = cust3.get(cust3Index);
            int currTransactionAmount = Integer.parseInt(currentCustData[2]);
            String currDate = currentCustData[3];
            cust3Records.add(cust3Index, new AccountRecord(currTransactionAmount, currDate));
            if (cust3Index == cust3.size() - 1) {
                customer3 = new Customer(Integer.parseInt(currentCustData[0]), currentCustData[1], cust3Records);
            }
        }

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println(customers);

        System.out.println("Positive accounts: " );
        for(int custIndex = 0; custIndex < customers.size(); custIndex++)
        {
            Customer currCust = customers.get(custIndex);
            if(currCust.getBalance() >= 0)
            {
                System.out.println(currCust);
            }
        }
        System.out.println("Negative accounts:");
        for(int custIndex = 0; custIndex < customers.size(); custIndex++)
        {
            Customer currCust = customers.get(custIndex);
            if(currCust.getBalance() < 0)
            {
                System.out.println(currCust);
            }
        }
    }
    // test comment
}