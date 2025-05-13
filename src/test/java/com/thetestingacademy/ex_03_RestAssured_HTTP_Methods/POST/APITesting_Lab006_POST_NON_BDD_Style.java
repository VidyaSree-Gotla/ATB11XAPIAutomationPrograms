package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab006_POST_NON_BDD_Style {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    @Test
    public void Test_POST_NONBDD_AUTH(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
                rs = RestAssured.given();
                rs.baseUri("https://restful-booker.herokuapp.com");
                rs.basePath("/auth");
                rs.contentType("application/json");
                rs.body(payload).log().all();

                r = rs.when().log().all().post();

                vr = r.then().log().all();
                vr.statusCode(200);


    }
}
