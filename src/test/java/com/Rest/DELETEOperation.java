package com.Rest;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
public class DELETEOperation {


    @Test
    public void delete_customer_by_id() {
        System.out.println("================================== GET REQUEST =========================================");
        System.out.println("Update a record in customers........");

        Response resp =

                given().when().delete("http://localhost:3000/CustomersDetails/171").
                        then().
                        statusCode(200).log().all()
                        .extract().response();

        int codes = resp.getStatusCode();
        Assert.assertEquals(codes, 200, "Status Code is different");

    }





}
