package com.thetestingacademy.ex_02_TestNG_AllureReport;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab004_Multiple_TestCases {


    String pincode = "90210";
    @Test//Annotation
    public void Positive_TC1(){
        pincode = "90210";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void Negitive_TC2(){
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void Negitive_TC3(){
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
