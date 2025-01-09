import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

public class ParserJSON {
    @Test
    public void testRestAssured(){
        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        Object answer = response.get("messages");
        System.out.println(answer);
    }
}