package ru.geekbrains.java2.makerov.dz1;

public class Team {



    String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {

        for (Competitor competitor : competitors) {
            competitor.info();

        }


    }



}
