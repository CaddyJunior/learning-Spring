package com.example.learn_spring_framework.examples.b1.classes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some Initialisation");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}
