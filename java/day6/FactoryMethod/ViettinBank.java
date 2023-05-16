package day6.FactoryMethod;

import day6.FactoryMethod.Bank;

public class ViettinBank implements Bank {

    @Override
    public String getBankName() {
        return "ViettinBank";
    }

    @Override
    public void payment() {
        System.out.println("Triển khai riêng của ViettinBank");
    }
}