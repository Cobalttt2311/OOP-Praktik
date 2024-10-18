package com.jtk.polban.football;

public class Midfielder extends Player implements Coach, Captain {

    public Midfielder(String name, int number) {
        super(name, number);
    }

    @Override 
    public void play() {
        System.out.println(name + " " + number + " is Playing as Midfielder");
    }   

    public void showPosition() {
        System.out.println("Position : CDM");
    }

    public void status() {
        System.out.println(name + " " + "is Ready to Play");
    }

    public void strategy() {
        System.out.println("Strategy : Tiki Taka");
    }

    public void trainPlayers() {
        System.out.println("Training Players : Attacking");
    }

    public void leadTeam() {
        if (name == "Pep Guardiola") {
            System.out.println("Leading Team : Barcelona");
        }
    }

    public void motivatePlayer() {
        if (name == "Pep Guardiola"){
            System.out.println("Motivating Player : Be Humble");
        }
    }
}
