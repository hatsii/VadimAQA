package apiTest;

import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static builders.PetStorePetGenerator.setPetData;
import static io.restassured.RestAssured.given;

public class PetStorePetsOperation {

    @Test
    public void createPet(){
       given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .baseUri("https://petstore3.swagger.io/api/v3")
               .basePath("/pet")
               .body(setPetData())
               .when().post()
               .then().log().body().statusCode(200).assertThat().body("name", CoreMatchers.equalTo(setPetData().getName()));


    }
    @Test
    public void CheckCreatePet(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore3.swagger.io/api/v3")
                .basePath("/pet/121")
                .when().get()
                .then().log().body().statusCode(200).assertThat().body("name", CoreMatchers.equalTo(setPetData().getName()));
    }
    @Test
    public void deletePet(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore3.swagger.io/api/v3")
                .basePath("/pet/121")
                .when().delete()
                .then().log().body().statusCode(200);
    }


}
