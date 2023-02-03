package com.ice.day03;

//平均年龄
public class average {
    public static void main(String[] args) {
        String[] arr = {"李世民-25", "李白-42", "李太白-52", "太白金星-1000", "李长庚-1997"};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            String age1 = arr[i].split("-")[1];
            int age = Integer.parseInt(age1);
            total = total + age;
        }
        int average = total / arr.length;
        System.out.println(average);
    }
}
