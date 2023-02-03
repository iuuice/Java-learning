package com.ice.Dao;

import javax.naming.Name;
import java.util.Arrays;

public class HeroDao {
    //数据容器
    private static String[] heros = {"墨菲特-坦克", "塞恩-坦克", "艾希-射手", "金克斯-射手", "卡莎-射手", "锐雯-战士", "菲奥娜-战士"};

    //1.查询所有英雄
    public static String[] selectAll() {
        return heros;
    }

    //  2.根据职业查询英雄
    public static String[] selectByJob(String job) {
        String[] narr = {};
        for (String n : heros) {
            String njob = n.split("-")[1];
            if (njob.equals(job)) {
                narr = Arrays.copyOf(narr, narr.length + 1);
                narr[narr.length - 1] = n;
            }
        }
        return narr;
    }

    //3.根据名字和职业添加英雄
    public static void insertByNameAndJob(String name, String job) {
        String nstr = name + "-" + job;
        heros = Arrays.copyOf(heros, heros.length + 1);
        heros[heros.length - 1] = nstr;

    }

    //4.根据下标删除英雄
    public static void deleteByIndex(int index) {
        heros[index] = heros[heros.length - 1];
        heros = Arrays.copyOf(heros, heros.length - 1);
    }

    //5.根据英雄名字模糊查找英雄
    public static String[] selectByName(String name) {
        String[] narr = {};
        for (String i : heros) {
            String names = i.split("-")[0];
            if (names.contains(name)) {
                narr = Arrays.copyOf(narr, narr.length + 1);
                narr[narr.length - 1] = i;
            }
        }

        return narr;
    }

    //6.根据英雄名字的字数查找英雄
    public static String[] selectByNameLength(int n) {
        String[] narr = {};
        for (String i : heros) {
            String names  =i.split("-")[0];
            if (names.length() == n) {
                narr=Arrays.copyOf(narr,narr.length+1);
                narr[narr.length-1]=names;

            }
        }
        return narr;
    }
    //7.根据职业查找匹配的英雄个数
    public static int selectByJobCount(String job) {
           int count = 0;
            for (String n : heros) {
                String njob = n.split("-")[1];
                if (njob.equals(job)) {
                    count++;
                }
            }
            return count;
    }

}
