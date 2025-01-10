package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.ReqResUserYear;
import static io.restassured.RestAssured.given;

import java.util.List;

public class ReqResYearTest {
    public static final String BASE_URI = "https://reqres.in/api/unknown";
    @Test
    public void yearGreater2000Test() {
        List<ReqResUserYear> infousers = RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri(BASE_URI)
                .when().get()
                .then().log().body().extract()
                .jsonPath()
                .getList("data", ReqResUserYear.class);

        for(ReqResUserYear user : infousers){
            assert user.getYear() >= 2000;
            System.out.println(user.getYear());

        }
    }
}
