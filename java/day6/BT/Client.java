package day6.BT;

public class Client {
    public static void main(String[] args) {
        // TPBank
        Card card = CardFactory.getCard("Titanium");
        if(card != null) {
            System.out.println(card.getCardType());
            System.out.println("Credit limit: "+card.getCreditLimit());
            System.out.println("Renewal fee: "+card.getAnnualCharge());


        }
    }
}
