import data.cards.*;
import data.flower.Chamomile;
import data.flower.Rose;
import data.flower.Tulip;
import data.payment.Card;
import data.payment.Cash;
import data.payment.ContextStrategy;

import data.set.Basket;
import data.set.Bouquet;

import java.util.Scanner;

import static data.set.Basket.suma;
import static data.set.Bouquet.sumaa;


public class Main {

    public static void main(String[] args) {

        Rose rose = Rose.getRandomRose();
        System.out.println(rose);

        Chamomile chamomile = Chamomile.getRandomChamolite();
        System.out.println(chamomile);

        Tulip tulip = Tulip.getRandomTulip();
        System.out.println(tulip);

        ContextStrategy pay_cash = new ContextStrategy(new Cash());
        ContextStrategy pay_card = new ContextStrategy(new Card());
        CardsType discount = new PayDecorator(new Discount());
        CardsType accumulative = new PayDecorator(new Accumulative());

        System.out.println("Do you want formed bouquet or not? (yes, no)");
        Scanner scanner = new Scanner(System.in);
        String say = scanner.nextLine();
        if (say.equals("yes")) {
            Bouquet bouquet = Bouquet.getRandomBouquet();
            System.out.println(bouquet);
        } else {
            System.out.println("Enter amount of flowers: ");
            int amount = scanner.nextInt();
            System.out.println("0 - Rose\n" + "1 - Chamomile\n" + "2 - Tulip");
            System.out.println("Enter the type of flowers: ");
            int type = scanner.nextInt();
            if (type == 0) {
                Basket basket = Basket.getBasket(amount, 0);
                System.out.println(basket);
            } else if (type == 1) {
                Basket basket = Basket.getBasket(amount, 1);
                System.out.println(basket);
            } else if (type == 2) {
                Basket basket = Basket.getBasket(amount, 2);
                System.out.println(basket);
            } else
                System.out.println("Please, enter right type of flower (0, 1 or 2)");

        }
        System.out.println("Which card do you have? (accumulative, discount, none)");
        Scanner scanner2 = new Scanner(System.in);
        String card_type = scanner2.nextLine();
        if (say.equals("no")) {
            if (card_type.equals("discount"))
                System.out.println(discount.pay(suma));
            else if (card_type.equals("accumulative"))
                System.out.println(accumulative.pay(suma));
        } else if (say.equals("yes")) {
            if (card_type.equals("discount"))
                System.out.println(discount.pay(sumaa));
            else if (card_type.equals("accumulative"))
                System.out.println(accumulative.pay(sumaa));
        } else
            System.out.println("Okay");


        System.out.println("How will you pay? (card, cash)");
        Scanner scanner3 = new Scanner(System.in);
        String money = scanner3.nextLine();
        if (money.equals("card"))
            System.out.println(pay_card.getMoney(money));
        else
            System.out.println(pay_cash.getMoney(money));

    }
}
