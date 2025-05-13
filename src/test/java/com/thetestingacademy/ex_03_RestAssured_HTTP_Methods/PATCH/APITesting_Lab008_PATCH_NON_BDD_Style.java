package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab008_PATCH_NON_BDD_Style {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void Test_PUT_NON_BDD_Style() {
        String token = "fee3002320c9499";
        String bookingid = "1058";
        String payload = "{\n" +
                "    \"firstname\" : \"Kavya\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";
        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/" + bookingid);
        rs.contentType(ContentType.JSON);
//        r.auth().oaut
        rs.cookie("token", token);
        rs.body(payload).log().all();

        r = rs.when().log().all().patch();


        vr = r.then().log().all();
        vr.statusCode(200);
    }
}
