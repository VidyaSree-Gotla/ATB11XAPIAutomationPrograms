package com.thetestingacademy;
import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab001_Basic_Program {

    //In rest Assured we will use Gherkin Syntax.
    //Given() --> will indicate the base URL and base path on which we are doing validation
    //when() --> a http method on which we need to validate the output
    //Then() --> expected output

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pincode = sc.next();

        //Validating the location details when we enter a pincode
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/"+pincode)

                .when()
                .get()

                .then()
                .log().all()
                .statusCode(200);


    }

}
