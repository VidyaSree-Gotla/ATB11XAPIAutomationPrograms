package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class APITesting_Lab015_AlwaysRun {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
