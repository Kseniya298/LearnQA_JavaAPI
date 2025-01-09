import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


public class redirect2 {
    @Test
    public void testRestAssured(){

        Response response = RestAssured
                .given()
                .redirects()
                .follow(true)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();

        response.prettyPrint();

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
    }
}