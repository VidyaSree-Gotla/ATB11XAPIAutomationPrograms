package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class APITesting_Lab013_DependsOnMethod {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);

    }
}
