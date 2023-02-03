package com.ice.day04;

import java.util.Scanner;
//Scanner输入任意一串字符串，统计其中每个符号出现的次数
public class homework01 {
    public static void main(String[] args) {
        System.out.println("请输入任意一组字符串");
        String randomInput= new Scanner(System.in).next();
        int countNumber=0;//计算数字
        int countUpch=0;//计算大写字母
        int countDownch=0;//计算小写字母
        int countOther=0;//计算其它字符
        char[]Arraych= randomInput.toCharArray();//将字符串转化成字符数组

        for(int i=0;i<Arraych.length;i++){
            if(Arraych[i]>='0'&&Arraych[i]<='9'){
                countNumber++;
            }else if(Arraych[i]>='A'&&Arraych[i]<='Z') {
                countUpch++;
            }else if(Arraych[i]>='a'&&Arraych[i]<='z'){
            countDownch++;}
            else{
                countOther++;
            }
        }
        System.out.println("数字的个数为"+countNumber);
        System.out.println("大写字母的个数为"+countUpch);
        System.out.println("小写字母的个数为"+countDownch);
        System.out.println("其它字符的个数为"+countOther);
    }
}


