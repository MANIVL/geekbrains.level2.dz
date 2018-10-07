package ru.geekbrains.java2.makerov.dz1;

public class Wall extends Obstacle {


    int heigthWall;

    public Wall(int heigthWall) {
        this.heigthWall = heigthWall;

    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(heigthWall);
    }

}
