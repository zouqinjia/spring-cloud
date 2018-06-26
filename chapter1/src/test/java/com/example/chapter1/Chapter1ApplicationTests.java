package com.example.chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Chapter1ApplicationTests {

    public static void main(String[] args) {

        List<users> users = new ArrayList<>();
        users users1 = new users();
        users1.setId("1");
        users1.setName("one");
        users.add(users1);
        users1 = new users();
        users1.setId("1");
        users1.setName("one");
        users.add(users1);
        users1 = new users();
        users1.setId("2");
        users1.setName("two");
        users.add(users1);
        System.out.println(users.size());
        long count = users.stream().filter(users2 -> {

            System.out.println(users2.getId());
            return users2.getId().equals("1");
        }).count();
        System.out.println(count+"count is");
    }


    public static class users {

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
