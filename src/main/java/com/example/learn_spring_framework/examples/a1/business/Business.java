package com.example.learn_spring_framework.examples.a1.business;

import com.example.learn_spring_framework.examples.a1.depencies.Dependency1;
import com.example.learn_spring_framework.examples.a1.depencies.Dependency2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Business {


    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public Business(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - Business Class");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public Dependency1 getDependency1() {
        return dependency1;
    }

    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDep1");
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDep2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Business{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
