package ru.geekbrains.java2.makerov.dz3Collection;

import java.util.*;

public class Task2 {


    private HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();


    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<String>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }

    HashSet<String> get(String lastName) {

        return map.get(lastName);

    }
}
