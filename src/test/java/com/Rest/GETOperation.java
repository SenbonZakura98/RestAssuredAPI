package com.Rest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import io.restassured.http.ContentType;
import io.restassured.response.Response;;

import static io.restassured.RestAssured.given;

public class GETOperation {


            // Sce_01: get all EmployeeDetails
            @Test
            public void get_all_EmployeeDetails() {
                System.out.println("================================== GET REQUEST =========================================");
                System.out.println("Get all EmployeeDetails");

                Response resp = given().contentType("application/json").accept(ContentType.JSON).when()
                        .get("http://localhost:3000/EmployeeDetails?id=202").then().statusCode(200).log().all().extract().response();
                int statusCode = resp.getStatusCode();
                Assert.assertEquals(statusCode, 200);
                System.out.println("Status Code is " + statusCode + " and Test is Passed!!!");
                System.out
                        .println("\n=========================================================================================");

            }


            @Test
            public void search_Employee_By_Job_Title() {
                System.out.println("================================== GET REQUEST =========================================");
                System.out.println("Search Employee by Job Title (President)");
                Response resp = given().contentType("application/json").accept(ContentType.JSON).when()
                        .get("http://localhost:3000/EmployeeDetails?jobTitle=President&id=206").then().statusCode(200).log().all()
                        .extract().response();
                int statusCode = resp.getStatusCode();
                Assert.assertEquals(statusCode, 200);
                System.out.println("Status Code is " + statusCode + " and Test is Passed!!!");
                System.out
                        .println("\n=========================================================================================");

            }


        }

