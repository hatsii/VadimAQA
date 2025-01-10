package apiTest;

import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static builders.PetStorePetGenerator.setPetData;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetStorePetsOperation {

    public static final String BASE_URI = "https://petstore3.swagger.io/api/v3";
    public static final String BASE_PATH = "/pet";

    @Test
    public void createPet(){
       given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .baseUri(BASE_URI)
               .basePath(BASE_PATH)
               .body(setPetData())
               .when().post()
               .then().log().body().statusCode(200)
               .assertThat().body("name",equalTo(setPetData().getName()));


    }
    @Test
    public void CheckCreatePet(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH + "/121")
                .when().get()
                .then().log().body().statusCode(200).assertThat().body("name", CoreMatchers.equalTo(setPetData().getName()));
    }
    @Test
    public void deletePet(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH + "/121")
                .when().delete()
                .then().log().body().statusCode(200);
    }
}
