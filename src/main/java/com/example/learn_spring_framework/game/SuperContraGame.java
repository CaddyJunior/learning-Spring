package com.example.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Look up");
    }

    public void down(){
        System.out.println("Crouch");
    }

    public void left(){
        System.out.println("Shoot");
    }

    public void right(){
        System.out.println("Move forward");
    }
}
