package com.example.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into hole");
    }

    public void left(){
        System.out.println("move Back");
    }

    public void right(){
        System.out.println("Move forward");
    }
}
