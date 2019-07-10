package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExCollection {
    public static void main(String[] args) {
        // key, value로 구성
        Map<String, Integer> map = new HashMap<>();

        map.put("kor", 100);
        map.put("mat", 100);
        map.put("eng", 100);
        map.put("eng", 88);

        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        printMap(map);

        map.clear();
        printMap(map);


        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("Never Not");
        list.add("Youth");
        list.add("Drugs & The Internet");
        map2.put("Pop", list);

        List<Map<String, String>> list2 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("댄스", "노래 1");
        map3.put("발라드", "노래 2");


        list2.add(map3);
        System.out.println(list2);
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.print(key + ": " + map.get(key) + " | ");
        }
        System.out.println();
    }

}

