package ru.geekbrains.java2.makerov.dz3Collection;

import java.util.HashMap;
import java.util.HashSet;

public class Task1 {

    public static void task1() {
        HashSet<String> month = new HashSet<String>();
        String[] words = {"Октябрь", "Январь", "Декабрь", "Сентябрь",
                "Март", "Июнь", "Август", "Март", "Июль",
                "Февраль", "Октябрь", "Май", "Ноябрь", "Январь",
                "Апрель", "Декабрь", "Декабрь", "Июль"};
        for (String m : words) {
            month.add(m);
        }
        System.out.println(month);

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String s : words) {
            if ((map.get(s)) == null) {
                map.put(s, 1);
            } else {
                map.put(s, (map.get(s) + 1));
            }
        }
        System.out.println(map.toString());
    }
}
