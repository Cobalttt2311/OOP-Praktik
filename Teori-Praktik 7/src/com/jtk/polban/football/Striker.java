package com.jtk.polban.football;

public class Striker extends Player{
    public Striker(String name, int number) {
        super(name, number);
    }

    public void play() {
        System.out.println(name + " " + number + " is Playing as Striker");
    }

    public void showPosition(){
        System.out.println("Position : ST");
    }

    public void status(){
        System.out.println(name + " "  + "is Ready to Play");
    }
}

