package com.Rest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class PUTOperation {


    @Test
    public void update_a_record_in_customers() {
        System.out.println("================================== PUT REQUEST =========================================");
        System.out.println("Update a record in customers........");

        HashMap data = new HashMap();
        data.put("name", "Kenpachi Zaraki");
        data.put("city", "Japan");
        Response res =
                given().
                        contentType("application/json").
                        contentType(ContentType.JSON).
                        body(data).
                        when().
                        put("http://localhost:3000/CustomersDetails/172").
                        then().
        statusCode(200).
                        log().all().
                        extract().response();
        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.err.println("Status Code is '"+statusCode+"' and Passed");
    }




















}
