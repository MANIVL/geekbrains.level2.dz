package ru.geekbrains.java2.makerov.dz3Password;

/*
Необходимо из консоли считать пароль и проверить валидность,
результат будет true или false

Требования:
1. Пароль должен быть не менее 8ми символов.
2. В пароле должно быть число
3. В пароле должна быть хотя бы 1 строчная буква
4. В пароле должна быть хотя бы 1 заглавная буква
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String s = sc.nextLine();
        System.out.println(check(s));
    }

    private static boolean check(String s) {
        Pattern p = Pattern.compile("^.{8,20}$"); //проверка кол-ва символов (от 8 до 20)
        Matcher m = p.matcher(s); //matcher - это поиск соответствующего выражения паттерну
        if (m.matches()) {
            Pattern p1 = Pattern.compile("^.*\\d+.*$"); //проверка на обязательное наличие цифр
            Matcher m1 = p1.matcher(s);
            if (m1.matches()) {
                Pattern p2 = Pattern.compile("^.*[a-z]+.*$"); //проверка на обязательное наличие цифр
                Matcher m2 = p2.matcher(s);
                if (m2.matches()) {
                    Pattern p3 = Pattern.compile("^.*[A-Z]+.*$"); //проверка на обязательное наличие цифр
                    Matcher m3 = p3.matcher(s);
                    return m3.matches();
                }

            }
        }
        return false;
    }
}
