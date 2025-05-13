package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab010_Before_After_Test {

    //Before Test testcases are executed in the order in which they are written

    @BeforeTest
    public void GetToken(){
        System.out.println("Get the token ID");
    }
    @BeforeTest
    public void  getBookingID(){
        System.out.println("Get the Booking ID");
    }
    @Test
    public void putTheRequest(){
        System.out.println("Put the given request");
    }
    @AfterTest
    public void CloseAll(){
        System.out.println("Close all the test cases");
    }


}
