package com.thetestingacademy.ex_03_RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab007_PUT_NON_BDD_Style {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;
    @Test
    public void Test_PUT_NON_BDD_Style(){
        String token = "3d2346b979c9a0d";
        String bookingid = "1525";
        String payload = "{\n" +
                "    \"firstname\" : \"Kavya\",\n" +
                "    \"lastname\" : \"Sree\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/"+bookingid);
        rs.contentType(ContentType.JSON);
//        r.auth().oaut
        rs.cookie("token", token);
        rs.body(payload).log().all();

        r = rs.when().log().all().put();


        vr = r.then().log().all();
        vr.statusCode(200);
    }
}
