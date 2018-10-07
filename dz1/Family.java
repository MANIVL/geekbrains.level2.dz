package ru.geekbrains.java2.makerov.dz1;

public class Family implements Competitor {

    String type;
    String name;


    int maxRunDistance;
    int maxJumpHeigth;
    int maxSwimDistance;

    boolean onDistance;



    public Family(String type, String name, int maxRunDistance, int maxJumpHeigth, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(type + " " + name + " справился/ась с кроссом!");
        } else {
            System.out.println(type + " " + name + " не справился/ась с кроссом!");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " справился/ась с заплывом!");
        } else {
            System.out.println(type + " " + name + " не справился/ась с заплывом!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxJumpHeigth) {
            System.out.println(type + " " + name + " справился/ась с высотой!");
        } else {
            System.out.println(type + " " + name + " не справился/ась с высотой!");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }


    @Override
    public void info() {

        if (onDistance == true)
                System.out.println(type + " " + name + " " + "справился/ась с испытанием");
        else
            System.out.println(type + " " + name + " " + "не справился/ась с испытанием");

    }



}
