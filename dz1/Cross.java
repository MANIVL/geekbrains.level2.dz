package ru.geekbrains.java2.makerov.dz1;

public class Cross extends Obstacle {


    int lengthCross;


    public Cross(int lengthCross) {
        this.lengthCross = lengthCross;

    }


    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lengthCross);
    }
}
