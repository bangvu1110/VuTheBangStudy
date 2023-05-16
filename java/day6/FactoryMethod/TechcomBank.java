package day6.FactoryMethod;

import day6.FactoryMethod.Bank;

public class TechcomBank implements Bank {

    @Override
    public String getBankName() {
        return "TechcomBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của TechcomBank");
    }
}