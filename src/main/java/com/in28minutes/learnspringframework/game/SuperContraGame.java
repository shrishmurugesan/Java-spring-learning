package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole {

    public final String name = "Super Contra";

    public void up() {
        System.out.println("SuperContra Jump");
    }

    public void down() {
        System.out.println("SuperContra Go into a hole");
    }

    public void left() {
        System.out.println("SuperContra Moves back");
    }

    public void right() {
        System.out.println("SuperContra Moves forward");
    }

    @Override
    public String getName() {
        return name;
    }

}
