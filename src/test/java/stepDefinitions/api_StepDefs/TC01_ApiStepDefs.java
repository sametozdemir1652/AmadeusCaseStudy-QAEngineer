package stepDefinitions.api_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertTrue;


public class TC01_ApiStepDefs {


    Response response;

    @Given("Send a GET request to the API")
    public void sendAGETRequestToTheAPI() {

        String url = "https://flights-api.buraky.workers.dev";
        response = given().get(url);

    }

    @Then("Verify the HTTP status code")
    public void verifyTheHTTPStatusCode() {

        response.then().statusCode(200);
    }

    @And("Verify the Content-Type")
    public void verifyTheContentType() {
        response.then().contentType("application/json");
    }

    @And("Verify that response body is in desired format")
    public void verifyThatResponseBodyIsInDesiredFormat() {

        response.then().body("data", hasSize(greaterThan(0)));

        assertTrue(response.asString().contains("id"));
        assertTrue(response.asString().contains("from"));
        assertTrue(response.asString().contains("to"));
        assertTrue(response.asString().contains("date"));



    }
}
