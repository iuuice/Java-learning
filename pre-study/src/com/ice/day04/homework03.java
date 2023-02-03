package com.ice.day04;
//计算100之内所有质数的和？
public class homework03 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=2;i<=100;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                sum+=i;
            }
        }
        System.out.println("100之内所有质数的和为"+sum);

    }
}