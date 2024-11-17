package com.example.learn_spring_framework.examples.c1.classes;

import org.springframework.stereotype.Component;

@Component
public class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}
