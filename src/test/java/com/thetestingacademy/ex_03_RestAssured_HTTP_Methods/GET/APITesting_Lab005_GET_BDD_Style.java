package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab005_GET_BDD_Style {
    @Test
    public void test_GET_Positive(){
        String pincode ="388620";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);
    }
}
