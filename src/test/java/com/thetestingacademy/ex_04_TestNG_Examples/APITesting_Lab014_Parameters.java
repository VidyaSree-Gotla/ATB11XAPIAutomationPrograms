package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab014_Parameters {

    //Parameters can be accesses using testng.xml files by providing parameter there
    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome!");
        }

    }
}
