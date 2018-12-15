package data.payment;

public class Cash implements Strategy{
    @Override
    public String getMoney(String money){
        return "I'm waiting for your cash ...";
    }

}
