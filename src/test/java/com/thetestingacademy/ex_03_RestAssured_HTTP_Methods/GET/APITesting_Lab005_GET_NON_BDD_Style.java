package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab005_GET_NON_BDD_Style {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    @Test
    public void Test_GET_NONBDD(){
        String pincode = "560066";
        //Given
        rs =RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/"+pincode);
        //WHEN
         r = rs.when().log().all().get();
        System.out.println(r.asString());
        //THEN
        vr = r.then().log().all();
        vr.statusCode(200);
    }
}
