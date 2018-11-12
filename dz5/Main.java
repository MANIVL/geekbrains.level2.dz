package ru.geekbrains.java2.makerov.dz5Thread;

/* Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int size = 10 000 000 ;
static final int h = size / 2 ;
float [] arr = new float [ size ].
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr [ i ] = ( float )( arr [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0 .2f + i / 5) *
Math . cos ( 0.4f + i / 2 )).
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
*/

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {

        method1();
        method2();

    }

    public static float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public static void method1() {

        float[] arr = new float[size];
        long a = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }

        calculate(arr);
        System.currentTimeMillis();
        System.out.println("Метод 1: " + (System.currentTimeMillis() - a));

    }


    static public void method2() {

        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        long a = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
            a = System.currentTimeMillis();
        }
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);


        Thread t1 = new Thread(new Runnable() {
            public void run() {
                float[] a1 = calculate(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                float[] a2 = calculate(arr2);
                System.arraycopy(a2, 0, arr2, 0, a2.length);
            }
        });

        t2.start();
        t1.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {
        }


        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("Метод 2: " + (System.currentTimeMillis() - a));


    }


}
