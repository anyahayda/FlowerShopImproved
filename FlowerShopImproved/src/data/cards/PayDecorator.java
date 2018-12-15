package data.cards;

public class PayDecorator extends CardDecorator{
    public PayDecorator(CardsType decoratedCard) {
        super(decoratedCard);
    }
    @Override
    public double pay(double flowerPrice) {
        return decorated.pay(flowerPrice);
    }
}
