package ru.geekbrains.java2.makerov.dz1;

public class Water extends Obstacle {

    int lengthSweem;

    public Water(int lengthSweem) {
        this.lengthSweem = lengthSweem;

    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(lengthSweem);
    }
}

