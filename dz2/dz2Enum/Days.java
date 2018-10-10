package ru.geekbrains.java2.makerov.dz2Enum;

public enum Days {

    MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(),
    FRIDAY(), SATURDAY(), SUNDAY();


    public static void getWorkingHours(Days days) {

        switch (days) {
            case MONDAY:
                System.out.println("Понедельник. До конца рабочей недели осталось 40 рабочих часов");
                break;
            case TUESDAY:
                System.out.println("Вторник. До конца рабочей недели осталось 32 рабочих часа");
                break;
            case WEDNESDAY:
                System.out.println("Среда. До конца рабочей недели осталось 24 рабочих часа");
                break;
            case THURSDAY:
                System.out.println("Четверг. До конца рабочей недели осталось 16 рабочих часов ");
                break;
            case FRIDAY:
                System.out.println("Пятница. До конца рабочей недели осталось 8 рабочих часов");
                break;
            case SATURDAY:
                System.out.println("Суббота. Сегодня выходной");
                break;
            case SUNDAY:
                System.out.println("Воскресенье. Сегодня выходной");
                break;
        }

    }


}
