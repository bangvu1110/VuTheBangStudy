package day6.BT;

public class Titanium implements Card{
    @Override
    public String getCardType() {
        return "Titanium";
    }

    @Override
    public int getCreditLimit() {
        return 2000000;
    }

    @Override
    public int getAnnualCharge() {
        return 10000;
    }
}
