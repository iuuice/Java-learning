package com.ice.day06;

public class main1 {
    public static void manin(String[] args){
    CreditCard c1 = new CreditCard("123456789", "Jack", 10000);
    CreditCard c2 = new CreditCard("987654321", "Rose", 20000);
    CreditCard c3 = new CreditCard("156286256", "Jkll", 30000);
    CreditCard c4 = new CreditCard("156461569", "Dack", 40000);
    CreditCard c5 = new CreditCard("152546569", "Lack", 50000);
    CreditCard c6 = new CreditCard("179558569", "Lack", 50000);
    CreditCard c7 = new CreditCard("156461569", "Pat", 100000);

    CreditCard[] cards = {c1, c2, c3, c4, c5, c6, c7};
    // 1. 统计Jack有多少张卡
    int count = 0;
    for( CreditCard card : cards) {
        if (card.Owner.equals("Jack")){
           count++;
        }
    }
    System.out.println("Jack has " + count + " cards");

    // 2. 统计Jack的卡总额度
    double sum = 0;
    for(CreditCard card: cards) {
        if (card.Owner.equals("Jack")){
            sum += card.money;
        }
    }
    System.out.println("Jack's total money is " + sum);

    //3.请问额度最低的卡是谁的
        double min = cards[0].money;
        for(CreditCard card: cards){
            if(card.money<min){
                min=card.money;
            }

        }
        System.out.println("The minimum money is " + min);

    }

}
