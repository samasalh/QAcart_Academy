package com.qacart.academy.testCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StudentsTest {
    @Test
    public void shouldBeAbleToLogin(){
String body ="{\n" +
        "\n" +
                "    \"email\":\"hatem@example.com\",\n" +
                "    \"password\":\"123456\"\n" +
                "}" ;
        given()
                .baseUri("https://todo.qacart.com").header("Content-Type\n,","application/json").body(body)
                .when().post("/api/v1/students/login")
                .then().log().all()
                .assertThat().statusCode(200)
        ;
    }


}
