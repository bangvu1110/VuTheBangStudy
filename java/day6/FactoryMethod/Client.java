package day6.FactoryMethod;

import day6.FactoryMethod.Bank;
import day6.FactoryMethod.BankFactory;

public class Client {
    public static void main(String[] args) {
        // TPBank
        Bank bank = BankFactory.getBank("TechcomBank");
        if(bank != null) {
            System.out.println(bank.getBankName());
            bank.payment();
        }
    }
}