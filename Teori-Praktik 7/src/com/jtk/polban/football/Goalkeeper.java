package com.jtk.polban.football;

public class Goalkeeper extends Player{
    public Goalkeeper(String name, int number) {
        super(name, number);
    }

    @Override   
    public void play() {
        System.out.println(name + " " + number + " is Playing as Goalkeeper");
    }

    public void showPosition() {
        System.out.println("Position : GK");
    }

    public void status() {  
        System.out.println(name + " " + "is Ready to Play");
    }
}