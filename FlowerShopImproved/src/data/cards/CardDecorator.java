package data.cards;

public abstract class CardDecorator implements CardsType {
    protected CardsType decorated;

    public CardDecorator(CardsType decorated){
        this.decorated = decorated;
    }

    public double pay(double flowerPrice) {
        return decorated.pay(flowerPrice);
    }
}
