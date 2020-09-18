package com.juven.java8.jihe;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValue {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");
        System.out.println("显示键");
        map.keySet().forEach(key -> System.out.println(key));

        System.out.println("显示值");
        map.values().forEach(key -> System.out.println(key));

    }
}
