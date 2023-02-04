package com.ice.day06;

public class CreditCard {
    public static String id;
    public static String Owner;
    public static double money;


    public CreditCard(String id, String Owner, double money) {
        this.id = id;
        this.Owner = Owner;
        this.money = money;
    }
    public String toString() {
        return "id: " + id + "Owner: " + Owner + "money: " + money;
    }
    public String getId() {
        if(id.length() == 9) {
            return id;
        } else {
            return "Error";
        }

    }
}

