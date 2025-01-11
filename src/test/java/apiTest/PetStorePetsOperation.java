package apiTest;

import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import static builders.PetStorePetGenerator.setPetData;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utils.Source.BASE_URI_PETSTORE;
import static utils.Source.BASE_PATH_PET;

import utils.Source;

public class PetStorePetsOperation {



    @Test
    public void createPet(){
       given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .baseUri(BASE_URI_PETSTORE)
               .basePath(BASE_PATH_PET)
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
                .baseUri(BASE_URI_PETSTORE)
                .basePath(BASE_PATH_PET + "/121")
                .when().get()
                .then().log().body().statusCode(200).assertThat().body("name", CoreMatchers.equalTo(setPetData().getName()));
    }
    @Test
    public void deletePet(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI_PETSTORE)
                .basePath(BASE_PATH_PET + "/121")
                .when().delete()
                .then().log().body().statusCode(200);
    }
}
