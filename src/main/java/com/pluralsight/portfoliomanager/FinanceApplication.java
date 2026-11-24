package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
        account1.deposit(new BigDecimal("100"));
        //account2.deposit(new BigDecimal("100"));

        CreditCard card = new CreditCard(789, "Pam", new BigDecimal("1800"));

        Portfolio portfolio = new Portfolio("Net Worth", "Pam");
        portfolio.add(house);
        portfolio.add(gold);
        portfolio.add(account1);
        portfolio.add(card);

        System.out.println("Total: $" + portfolio.getValue());
        System.out.println("Least valuable: $" + portfolio.getLeastValuable().getValue());
        System.out.println("Most valuable: $" + portfolio.getMostValuable().getValue());
    }
}
