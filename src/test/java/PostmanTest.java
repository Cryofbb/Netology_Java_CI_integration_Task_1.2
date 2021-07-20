
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanTest {
    @Test
    void shouldPostTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("watermelon")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("melon"))
        ;
    }
}