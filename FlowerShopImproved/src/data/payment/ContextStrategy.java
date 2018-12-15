package data.payment;

public class ContextStrategy {
    Strategy strategy;
    public ContextStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public String getMoney(String money) {
        return strategy.getMoney(money);
    }
}
