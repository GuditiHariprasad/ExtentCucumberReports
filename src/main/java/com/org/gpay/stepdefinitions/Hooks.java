package com.org.gpay.stepdefinitions;

import com.org.gpay.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {
    @Before(order=0)
    public void beforeScenario(Scenario scenario) {
        System.out.println("This will run before the Scenario");
        reportText=scenario;
        System.out.println("======================="+scenario.getName()+"=======================");
    }
    @After(order=0)
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
    @Before("@tag1")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }
    @Before("@tag2")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }
    @Before("@tag3")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }
    @After("@tag1")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");
    }
    @After("@tag2")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");
    }
    @After("@tag3")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");
    }

}

