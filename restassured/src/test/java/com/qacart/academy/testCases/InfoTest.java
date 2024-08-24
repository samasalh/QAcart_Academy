package com.qacart.academy.testCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InfoTest {
    @Test
    public void should_be_able_to_Get_CoursesInfo(){
        given()
                .baseUri("https://todo.qacart.com").header("type","WEB").header("language","NONE")
                .when().get("/api/v1/info/courses")
                .then().log().all()
                .assertThat().statusCode(200)
        ;


    }
    @Test
    public void should_be_able_to_Get_LeccturesInfo(){
        given()
                .baseUri("https://todo.qacart.com").queryParams("mode","VIDEO","type","PAID")
                .when().get("/api/v1/info/lectures")
                .then().log().all()
                .assertThat().statusCode(200)
        ;


    }
}
