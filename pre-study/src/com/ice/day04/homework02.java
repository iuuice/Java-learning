package com.ice.day04;

//
public class homework02 {
    //    public static void main(String[] args) {
//        //公鸡每只5元，母鸡每只3元，小鸡三元一只，用100块钱买100只鸡，问公鸡、母鸡、小鸡各多少只？
//        int money = 100;
//        int CountCock = 0;//公鸡数量
//        int CountHen = 0;//母鸡数量
//        int CountChick = 0;//小鸡数量
//        int CockPrice = 0;//公鸡价格
//        int HenPrice = 0;//母鸡价格
//        int ChickPrice = 0;//小鸡价格
//        for (CountCock = 1; CountCock <= 20; CountCock++) {
//            for (CountHen = 1; CountHen <= 33; CountHen++) {
//                for (CountChick = 1; CountChick <= 33; CountChick++) {
//                    CockPrice = CountCock * 5;
//                    HenPrice = CountHen * 3;
//                    ChickPrice = CountChick * 3;
//                    if (CockPrice + HenPrice + ChickPrice == money && CountCock + CountHen + CountChick == 100) {
//                            System.out.println("公鸡" + CountCock + "只，母鸡" + CountHen + "只，小鸡" + CountChick + "只");
//                            break;
//                        }
//
//                }
//            }
//        }
//
//
//    }
//}
    public static void main(String[] args) {
        //公鸡每只5元，母鸡每只3元，小鸡三元一只，用100块钱买100只鸡，问公鸡、母鸡、小鸡各多少只？
        int money = 100;
        int CountCock = 0;//公鸡数量
        int CountHen = 0;//母鸡数量
        int CountChick = 0;//小鸡数量
        int CockPrice = 0;//公鸡价格
        int HenPrice = 0;//母鸡价格
        int ChickPrice = 0;//小鸡价格
        for (CountCock = 1; CountCock <= 20; CountCock++) {
            for (CountHen = 1; CountHen <= 33; CountHen++) {
                for (CountChick = 3; CountChick <= 100; CountChick += 3) {//这里小计数量最多可以买100只,每次要以3的倍数买
                    CockPrice = CountCock * 5;
                    HenPrice = CountHen * 3;
                    ChickPrice = CountChick / 3;//这里三只小鸡一块
                    if (CockPrice + HenPrice + ChickPrice == money && CountCock + CountHen + CountChick == 100) {
                        System.out.println("公鸡" + CountCock + "只，母鸡" + CountHen + "只，小鸡" + CountChick + "只");
                        break;
                    }

                }
            }
        }
    }
}