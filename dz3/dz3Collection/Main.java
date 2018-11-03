package ru.geekbrains.java2.makerov.dz3Collection;


public class Main {
    public static void main(String[] args) {

        Task1 t1 = new Task1();
        t1.task1();

        System.out.println("----------------------------------------------------------------------");

        Task2 pb = new Task2();

        pb.add("Ivanov", "89112586398");
        pb.add("Petrov", "89214123574");
        pb.add("Petrov", "89212355252");
        pb.add("Sidorov", "89114025287");
        pb.add("Petrov", "89214785474");
        pb.add("Ivanov", "89058632583");

        System.out.println(pb.get("Ivanov"));

    }

}
