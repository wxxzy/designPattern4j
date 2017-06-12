package com.mungo.reflection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxx on 2017/5/3.
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "wangxx";
        //getClass方法
        Class<?> c1 = s.getClass();

        //forName方法
        Class<?> c2 = Class.forName("java.lang.String");
        Class<?> c3 = String.class;

        Class c4 = new ArrayList<String>().getClass();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //只写
        List<? super Integer> foo3 = new ArrayList<Number>();
        foo3.add(5);
        Object ii =foo3.get(0);
        System.out.println(ii.getClass());
        //只读
        List<? extends Number> foo4 = new ArrayList<Integer>();
        foo4.add(null);

    }

}
