package day6.BT;

public class Platinum implements Card{
    @Override
    public String getCardType() {
        return "Platinum";
    }

    @Override
    public int getCreditLimit() {
        return 1000000;
    }

    @Override
    public int getAnnualCharge() {
        return 5000;
    }
}