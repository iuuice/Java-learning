package com.ice.day03;

import javax.imageio.stream.IIOByteBuffer;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 2, 0, 9, 7};
        //键盘输入整数n，输出0到n的总和
        //键盘输入数值区间，查询匹配的成员
        System.out.println("请输入一个整数");
        int total = 0;
        int n = new Scanner(System.in).nextInt();
        for (int i=0;i<arr.length;i++) {
            if (i <n||i==n) {
                total += arr[i];
            }
        }
        System.out.println(total);
    }
}
