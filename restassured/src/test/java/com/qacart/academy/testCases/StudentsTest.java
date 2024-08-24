package com.qacart.academy.testCases;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class StudentsTest {
    @Test
    public void shouldBeAbleToLogin(){
 File body= new File("src/test/resources/login.json");
        given()
                .baseUri("https://todo.qacart.com").contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/api/v1/students/login")
                .then().log()
                .all()
                .assertThat().statusCode(200)
        ;
    }


}
