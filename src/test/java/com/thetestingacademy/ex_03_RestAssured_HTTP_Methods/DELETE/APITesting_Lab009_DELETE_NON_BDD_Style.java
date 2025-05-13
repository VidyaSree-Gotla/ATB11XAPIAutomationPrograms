package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab009_DELETE_NON_BDD_Style {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void Test_Delete_NON_BDD_Style() {
        String token = "52d7ead2ec29898";
        String bookingid = "1375";
        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + bookingid);
        rs.contentType(ContentType.JSON);
//        r.auth().oaut
        rs.cookie("token", token);

        r = rs.when().log().all().delete();


        vr = r.then().log().all();
        vr.statusCode(201);
    }
}
