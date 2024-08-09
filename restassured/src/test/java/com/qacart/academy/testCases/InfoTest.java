package com.qacart.academy.testCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InfoTest {
    @Test
    public void should_beabletoGetCoursesInfo(){
        given()
                .baseUri("https://todo.qacart.com").header("type","WEB").header("language","NONE")
                .when().get("/api/v1/info/courses")
                .then().log().all()
                .assertThat().statusCode(200)
        ;


    }
    @Test
    public void should_beabletoGetLeccturesInfo(){
        given()
                .baseUri("https://todo.qacart.com").queryParams("mode","VIDEO","type","PAID")
                .when().get("/api/v1/info/lectures")
                .then().log().all()
                .assertThat().statusCode(200)
        ;


    }
}
