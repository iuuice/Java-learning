package com.ice.day03;

public class integer {

    public static void main(String[] args) {
        String[] arr = {"李世民-25", "李白-42", "李太白-52","太白金星-1000","李长庚-1997"};

        for (int i = 0; i < arr.length; i++) {
            String age = arr[i].split("-")[1];
            int age1 = Integer.parseInt(age);
            if(age1<=30){
                System.out.println("年龄在30岁以下的"+arr[i].split("-")[0]);
            }

        }

    }
}