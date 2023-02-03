package com.ice.day04;

import java.util.Arrays;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        while (true) {
            String[] arr = {"李白", "李太白", "李世民", "李永乐", "李贺", "李广", "李小龙", "萧炎", "萧火火", "石昊", "叶凡"};
            System.out.println("-------欢迎进入人员管理-------");
            System.out.println("报1.查询完整名单");
            System.out.println("报2.根据姓氏查询名单");
            System.out.println("报3.根据字数查询名单");
            System.out.println("报4.录入新人员进名单");
            System.out.println("报5.开始名单模糊搜索");

            int n = new Scanner(System.in).nextInt();

            if (n == 1) {
                for (String str : arr) {
                    System.out.println(str);
                }
            } else if (n == 2) {
                System.out.println("请输入姓氏查询名单");
                String str1 = new Scanner(System.in).next();
                for (String str : arr) {
                    if (str.startsWith(str1)) {
                        System.out.println(str);
                    }
                }
            } else if (n == 3) {
                System.out.println("请输入名字字数");
                int str1 = new Scanner(System.in).nextInt();
                for (String str : arr) {
                    if (str.length() == str1) {
                        System.out.println(str);

                    }
                }
            } else if (n == 4) {
                System.out.println("请输入姓名");
                String nName = new Scanner(System.in).next();
                arr= Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1]=nName;
                System.out.println("录入成功");
            } else if (n == 5) {
                System.out.println("请输入姓名");
                String str = new Scanner(System.in).next();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].contains(str)) {
                        System.out.println(arr[i]);
                    }
                }

            }
        }
    }
}
