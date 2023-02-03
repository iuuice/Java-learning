package com.ice.day05;

import java.util.Scanner;

import com.ice.Dao.HeroDao;

public class main1 {
    public static void main(String[] args) {
//主菜单
        while (true) {
            System.out.println("欢迎进入英雄联盟");
            System.out.println("1.查询所有英雄");
            System.out.println("2.按类型查询英雄");
            System.out.println("3.添加英雄");
            System.out.println("4.根据下标删除英雄");
            System.out.println("5.根据英雄名字模糊查找英雄");
            System.out.println("6.根据英雄名字的字数查找英雄");
            System.out.println("7.根据职业查找匹配的英雄个数");

            int opt = new Scanner(System.in).nextInt();
            if (opt == 1) {
                String[] heros = HeroDao.selectAll();
                System.out.println("-------所有英雄-------");
                for (String n : heros) {
                    System.out.println(n);
                }
            } else if (opt == 2) {
                System.out.println("请输入英雄职业");
                String job = new Scanner(System.in).next();
                String[] heros = HeroDao.selectByJob(job);
                for (String n : heros) {
                    System.out.println(n);
                }
            } else if (opt == 3) {
                System.out.println("请输入英雄名字");
                String name = new Scanner(System.in).next();
                System.out.println("请输入英雄职业");
                String job = new Scanner(System.in).next();
                HeroDao.insertByNameAndJob(name, job);
                System.out.println("添加成功");
            } else if (opt == 4) {
                System.out.println("请输入下标");
                int index = new Scanner(System.in).nextInt();
                HeroDao.deleteByIndex(index);
                System.out.println("删除成功");

            } else if (opt == 5) {
                System.out.println("请输入英雄名字");
                String name = new Scanner(System.in).next();
                String[] heros = HeroDao.selectByName(name);
                for (String n : heros) {
                    System.out.println(n);
                }

            } else if (opt == 6) {
                System.out.println("请输入英雄名字的字数");
                int num = new Scanner(System.in).nextInt();
                String[] heros = HeroDao.selectByNameLength(num);
                for (String n : heros) {
                    System.out.println(n);
                }


            } else if (opt == 7) {
                System.out.println("请输入英雄职业");
                String job = new Scanner(System.in).next();
                int num = HeroDao.selectByJobCount(job);
                System.out.println(num);


            }


        }

    }
}


