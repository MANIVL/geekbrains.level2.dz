package ru.geekbrains.java2.makerov.dz1;

public class Main {

    public static void main(String[] args) {

        Course course = new Course(new Cross(100), new Wall(4), new Water(30));
        Team team = new Team("Семья", new Father("Анатолий"), new Mather("Светлана"), new Son("Дмитрий"), new MotherInLaw("Томара Ивановна"));
        course.doIt(team);
        System.out.println("\n<Результат марафона>\n");
        team.showResults();


    }


    }



