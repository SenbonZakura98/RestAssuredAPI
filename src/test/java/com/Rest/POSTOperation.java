package com.Rest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class POSTOperation {


    @Test
    public void Add_a_record_in_Salary() {
        System.out.println("================================== POST REQUEST =========================================");
        System.out.println("Add a Record in Salary");

        HashMap data = new HashMap();
        data.put("amount", "2495.00");

        Response resp =
                // yor resources
                given().
                        contentType("application/json").
                        contentType(ContentType.JSON).
                        body(data).
                        // your operation to be performed
                                when().
                        post("http://localhost:3000/Salary").
                        // your Validation
                                then().
                        statusCode(201).
                        log().all().
                        extract().response();
        String jsonString = resp.asPrettyString();
        int statusCode = resp.getStatusCode();
        Assert.assertEquals(statusCode, 201);
        System.out.println("Rrecord insterted successfully"+data);

    }




}
