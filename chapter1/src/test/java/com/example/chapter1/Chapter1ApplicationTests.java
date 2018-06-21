package com.example.chapter1;

import java.util.HashMap;
import java.util.Map;


public class Chapter1ApplicationTests {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        int pageSizeNum = Integer.parseInt("9");
        int pageIndexNum = Integer.parseInt("1");
        System.out.println(pageIndexNum + " " + pageSizeNum);
        if (pageSizeNum > 0 && pageIndexNum > 1) {
            System.out.println(pageIndexNum + " " + pageSizeNum);
            map.put("start", (pageIndexNum - 1) * pageSizeNum);
            map.put("limit", pageSizeNum);
        }
        System.out.println(map);
    }

}
