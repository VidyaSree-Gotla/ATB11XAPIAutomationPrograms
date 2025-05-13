package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Test;

public class APITesting_Lab016_InvocationCount {

    //Invocation count is the number of times that a test needs to be run.
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }

    @Test()
    public void test03(){
        System.out.println("Bye");
    }
}
