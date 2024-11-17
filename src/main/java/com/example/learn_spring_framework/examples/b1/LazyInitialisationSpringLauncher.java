package com.example.learn_spring_framework.examples.b1;

import com.example.learn_spring_framework.examples.a2.business.BusinessCalculationService;
import com.example.learn_spring_framework.examples.b1.classes.ClassB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitialisationSpringLauncher {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (LazyInitialisationSpringLauncher.class)) {
            System.out.println("Initialisation of Context is complete!!!");

            context.getBean(ClassB.class).doSomething();
        }
    }
}
