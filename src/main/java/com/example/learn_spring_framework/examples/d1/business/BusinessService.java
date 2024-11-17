package com.example.learn_spring_framework.examples.d1.business;

import com.example.learn_spring_framework.examples.d1.service.DataService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
@Named
public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public DataService getDataService() {
        System.out.println("Getter Injection");
        return dataService;
    }

    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}
