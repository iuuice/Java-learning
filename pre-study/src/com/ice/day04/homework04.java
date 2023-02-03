package com.ice.day04;
//任意输入一个年份，输出是平年还是闰年？
public class homework04 {
    public static void main(String[] args) {
        System.out.println("请输入一个年份");
        int year=new java.util.Scanner(System.in).nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"是平年");
        }
    }

}
