package com.in28minutes.learnspringframework.game;

public class PacManGame implements GamingConsole{

    private final String name = "PacMan";

    public void up(){
        System.out.println("PacMan Jump");
    }

    public void down(){
        System.out.println("PacMan Go into a hole");
    }

    public void left(){
        System.out.println("PacMan Moves back");
    }

    public void right(){
        System.out.println("PacMan Moves forward");
    }

    @Override
    public String getName() {
        return name;
    }

}
