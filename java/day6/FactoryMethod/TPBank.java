package day6.FactoryMethod;

import day6.FactoryMethod.Bank;

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của TPBank");
    }
}