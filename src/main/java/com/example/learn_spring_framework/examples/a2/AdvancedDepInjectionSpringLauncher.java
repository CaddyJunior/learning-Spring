package com.example.learn_spring_framework.examples.a2;

import com.example.learn_spring_framework.examples.a2.business.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AdvancedDepInjectionSpringLauncher {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (AdvancedDepInjectionSpringLauncher.class)) {

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
