package com.ice.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static CompanyDao companyDao = new CompanyDao();

    public static void main(String[] args) {

        while (true) {
            System.out.println("欢迎来到公司管理系统");
            System.out.println("1.查询所有公司");
            System.out.println("2.根据id查询公司");
            System.out.println("3.添加公司");
            System.out.println("4.根据年分区间查询公司");
            System.out.println("5.删除一家公司");
            System.out.println("6.按创立年份排序");
            System.out.println("7.按公司老板给公司分组查询");
            System.out.println("8.查询各年份创立的公司数量");

            int opr = new Scanner(System.in).nextInt();

            if (opr == 1) {
                opr1();

            } else if (opr == 2) {
                opr2();

            } else if (opr == 3) {
                opr3();
            } else if (opr == 4) {

            } else if (opr == 5) {

            } else if (opr == 6) {

            } else if (opr == 7) {

            }


        }
    }

    private static void opr1() {
        List<Company> list = companyDao.selectAll();
        for (Company e : list) {
            System.out.println(e.toString());
        }
    }

    private static void opr2() {
        System.out.println("请输入公司id");
        int id = new Scanner(System.in).nextInt();
        Company com = companyDao.selectById(id);
        System.out.println(com.toString());
    }

    private static void opr3() {
        System.out.println("请输入公司名");
        String nameCompany = new Scanner(System.in).next();
        System.out.println("请输入老板名字");
        String nameBoss = new Scanner(System.in).next();
        System.out.println("请输入公司创立的年份");
        int InitYear = new Scanner(System.in).nextInt();
        CompanyDao.insert(nameCompany, nameBoss, InitYear);
        System.out.println("输入成功");

    }

    private static void opr4() {

    }

    private static void opr5() {
        System.out.println("请输入公司Id");
        int id=new Scanner(System.in).nextInt();
        companyDao.deleteById(id);
        System.out.println("删除成功");
    }

    private static void opr6() {

    }

    private static void opr7() {

    }


}
