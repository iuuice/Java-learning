package com.ice.day03;

import java.security.PublicKey;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        String[] arr = {"锐雯-战士-6300", "泰隆-刺客-6300", "提莫-法师-4800", "瑞兹-法师-450", "剑圣-战士-450"};
//键盘输入英雄的职业，输入匹配的英雄
        System.out.println("请输入英雄的职业");
        String job = new Scanner(System.in).nextLine();
        for (String n : arr) {
            if (n.split("-")[1].equals(job)) {
                System.out.println(n.split("-")[0]);
            }
        }
    }
}
