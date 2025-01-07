import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static builders.PetStorePetGenerator.setPetData;
import static io.restassured.RestAssured.given;
import static java.lang.Math.log;

public class PetStoreCreatePet {

    @Test
    public void createPet(){
       given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .baseUri("https://petstore3.swagger.io/api/v3")
               .basePath("/pet")
               .body(setPetData())
               .when().post()
               .then().log().body().statusCode(200);


    }

}
