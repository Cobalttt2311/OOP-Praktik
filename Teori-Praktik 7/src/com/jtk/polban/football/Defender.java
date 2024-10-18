package com.jtk.polban.football;

public class Defender extends Player {

    public Defender(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(name + " " + number + " is Playing as Defender");
    }
    
    public void showPosition() {
        System.out.println("Position : CB");
    }

    public void status() {
        System.out.println(name + " " + "is Ready to Play");
    }
}

