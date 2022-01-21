package RestAssured;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class postExercise {

    private Response response;
    private String url = "https://reqres.in/api/users";

    @Test
    public void postTest() throws JsonProcessingException {
        Map<String, String> call = new HashMap<>();

        call.put("name", "Geiser");
        call.put("job", "Avenger");

        System.out.print(call);

        String json = new ObjectMapper().writeValueAsString(call);
        System.out.print(json);

    }
}
