package data.cards;

public class Discount implements CardsType{
    @Override
    public double pay(double flowerPrice){
        return Math.round(flowerPrice * 0.8);
    }
}
