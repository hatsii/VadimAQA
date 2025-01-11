package apiTest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static utils.Source.BASE_URI_PETSTORE;
public class PetStoreUserAuth {

    @Test
    public void invalidAuthUser(){
        //В этом запросе почему-то проходит авторизация с любыми данными
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI_PETSTORE)
                .when().get("/user/login?username=tatarkof&password=invalidPassword")
                .then().log().body().statusCode(400);
    }
}
