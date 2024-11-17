package com.example.learn_spring_framework.examples.b2;

import com.example.learn_spring_framework.examples.b1.classes.ClassB;
import com.example.learn_spring_framework.examples.b2.classes.NormalClass;
import com.example.learn_spring_framework.examples.b2.classes.PrototypeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanScopesSpringLauncher {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (BeanScopesSpringLauncher.class)) {

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
