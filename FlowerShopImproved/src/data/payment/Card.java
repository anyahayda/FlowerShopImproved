package data.payment;

public class Card implements Strategy{
    @Override
    public String getMoney(String money){
        return "I'm waiting for your card ...";
    }
}