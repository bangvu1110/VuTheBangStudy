package day6.BT;

public class MoneyBack implements Card{
    @Override
    public String getCardType() {
        return "MoneyBack";
    }

    @Override
    public int getCreditLimit() {
        return 500000;
    }

    @Override
    public int getAnnualCharge() {
        return 0;
    }
}
