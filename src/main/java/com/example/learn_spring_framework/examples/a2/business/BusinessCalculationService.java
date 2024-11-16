package com.example.learn_spring_framework.examples.a2.business;

import com.example.learn_spring_framework.examples.a2.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    private DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax(){
        System.out.println("Finding Max >>>>>>>>> ");
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
