package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class APITesting_Lab012_Groups {

    @Test(groups = {"sanity", "reg"}, priority = 1)
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"}, priority = 2)
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(true);
    }

    @Test(groups = {"p1","reg"},priority = 3)
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }
}
