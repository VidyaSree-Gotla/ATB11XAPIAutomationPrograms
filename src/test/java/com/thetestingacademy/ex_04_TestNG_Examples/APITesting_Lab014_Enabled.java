package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class APITesting_Lab014_Enabled {
    @Test
    public void test01() {
        Assert.assertTrue(true);
    }
    @Test(enabled = false)
    public void test02() {
        Assert.assertTrue(true);
    }
    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}
