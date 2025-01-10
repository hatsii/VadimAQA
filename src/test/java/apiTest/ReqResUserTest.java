package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.ReqResUser;

import java.util.List;

public class ReqResUserTest {
    @Test
    public void ReqResUserAvatarTest (){
        List<ReqResUser> infoAvatarUser = RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri("https://reqres.in/api/users")
                .when().get()
                .then().log().body().extract().jsonPath()
                .getList("data", ReqResUser.class);

        for (ReqResUser user : infoAvatarUser){
            assert user.getAvatar().contains("https://reqres.in");
            System.out.println(user.getAvatar());
        }
    }
}
