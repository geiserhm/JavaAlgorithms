package RestAssured;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class getExercise {

    private Response response;
    private String url = "https://reqres.in/api/users?page=2";

    @Test
    public void getTest(){

        response = get(url);

        System.out.print(response.getBody().asString()+ "\n");
        System.out.print(response.getHeader("content-type")+ "\n");
        System.out.print(response.getTimeIn(TimeUnit.MILLISECONDS) + "\n");

    }

    @Test
    public void validateStatusCode(){

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void validateStatusCodeUsingGiven(){

        given()
                .get(url)
        .then()
                .statusCode(200)
                .body("data.id[1]", Matchers.equalTo(8))
                .body("data.first_name", Matchers.hasItems("Michael", "Lindsay"));
    }

    @Test
    public void validateStatusLine(){

        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
    }

    @Test
    public void validateStatusLine2(){

        given()
                .get(url)
        .then()
                .statusLine("HTTP/1.1 200 OK");
    }

}
