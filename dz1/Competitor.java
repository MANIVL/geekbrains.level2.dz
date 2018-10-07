package ru.geekbrains.java2.makerov.dz1;

public interface Competitor {

    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
}
