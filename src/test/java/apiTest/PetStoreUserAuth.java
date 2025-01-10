package apiTest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PetStoreUserAuth {
    public static final String BASE_URI = "https://petstore3.swagger.io/api/v3";
    @Test
    public void invalidAuthUser(){
        //В этом запросе почему-то проходит авторизация с любыми данными
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .when().get("/user/login?username=tatarkof&password=invalidPassword")
                .then().log().body().statusCode(400);
    }
}
