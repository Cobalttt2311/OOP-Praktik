package com.jtk.polban.football;

abstract class Player {
    String name;
    int number;

    Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void status(){
        System.out.println(name + " " + number + "is Ready to Play");        
    }

    abstract void play();
    abstract void showPosition();
}
