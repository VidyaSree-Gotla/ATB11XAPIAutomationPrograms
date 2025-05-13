package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab006_POST_BDD_Style {
    @Test
    public void test_POST_Auth(){
        //https://restful-booker.herokuapp.com/auth
        //{
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType("application/json")
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);

    }

}
