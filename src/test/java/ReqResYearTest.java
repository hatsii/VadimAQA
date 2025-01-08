import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.ReqResUser;
import static io.restassured.RestAssured.given;
import static java.lang.Math.log;

import java.util.List;

public class ReqResYearTest {
    @Test
    public void yearGreater2000Test() {
        List<ReqResUser> infousers = RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri("https://reqres.in/api/unknown")
                .when().get()
                .then().log().body().extract()
                .jsonPath()
                .getList("data", ReqResUser.class);

        for(ReqResUser user : infousers){
            assert user.getYear() >= 2000;
            System.out.println(user.getYear());

        }
    }
}
