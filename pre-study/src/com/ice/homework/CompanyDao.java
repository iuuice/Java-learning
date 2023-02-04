package com.ice.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyDao {
    private static List<Company> list = new ArrayList<Company>();
    static {
        list.add(new Company(1, "艾欧尼亚", "艾瑞莉娅", 1997));
        list.add(new Company(2, "诺克萨斯", "德莱厄斯", 1998));
        list.add(new Company(3, "德玛西亚", "嘉文四世", 1999));
        list.add(new Company(4, "班德尔城", "努努", 2000));
        list.add(new Company(5, "皮尔特沃夫", "凯特琳", 2001));
        list.add(new Company(6, "战争学院", "盖伦", 2002));
        list.add(new Company(7, "弗雷尔卓德", "艾希", 2003));
    }

        public List<Company> selectAll() {
            return list;
        }

        public Company selectById(int id){
        for(Company e:list){
            if(e.getId()==id){
                return e;
            }

        }
        return null;
    }

    public static void insert(String name, String boss, int year) {
        Company company = new Company(getNextId(), name, boss, year);
        company.setBoss(boss);
        company.setId(getNextId());
        company.setName(name);
        company.setYear(year);
        list.add(company);
    }

    private static int getNextId() {
       int maxId = 0;
       for(Company cmp:list){
           if(cmp.getId()>maxId){
               maxId = cmp.getId();
           }
       }
         return maxId+1;
    }

    public  void deleteById(int id){
        Iterator<Company> itr=list.iterator();
        while(itr.hasNext()){
            Company cmp=itr.next();
            if(cmp.getId()==id){
                itr.remove();
            }
        }

    }

}
