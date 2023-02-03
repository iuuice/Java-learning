package com.ice.day03;

import javax.sound.sampled.TargetDataLine;

public class ifelse {
    public static void main(String[] args) {
        String[] arr = {"李世民-17", "李白-15", "李太白-52","太白金星-1000","李长庚-1997"};
        int total=0;
        int junior=0;
        int juniorcount=0;
        for(int i=0; i<arr.length; i++) {
            String age=arr[i].split("-")[1];
            int age2=Integer.parseInt(age);
            total=total+age2;
            if(age2<18){
                System.out.println("未成年员工"+arr[i].split("-")[0]);
                junior=junior+age2;
                juniorcount++;
            }
            }
        int average=total/arr.length;
        int averagejunior=junior/juniorcount;
        System.out.println("平均年龄"+average);
        System.out.println("未成年平均年龄"+averagejunior);
        }
    }
