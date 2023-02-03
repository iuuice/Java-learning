package com.ice.day03;

public class charArr {
    public static void main(String[] args) {
        String str = "beautifulStudentIsCool";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if ((charArr[i] >= 'A' && charArr[i] <= 'Z')) {
                System.out.println(charArr[i]);
            }

        }
    }
}