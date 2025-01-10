package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.ReqResUser;

import java.util.List;

public class ReqResUserTest {
        public static final String BASE_URI = "https://reqres.in/api/users";

    @Test
    public void ReqResUserAvatarTest (){
        List<ReqResUser> infoAvatarUser = RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri(BASE_URI)
                .when().get()
                .then().log().body().extract().jsonPath()
                .getList("data", ReqResUser.class);

        infoAvatarUser.forEach(user -> {
            assert user.getAvatar().contains("https://reqres.in");
            System.out.println(user.getAvatar());
        });
    }
}
