package Sample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.inputdata;
import io.restassured.RestAssured;

public class SampleDemoPostMethod {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://dummy.restapiexample.com";
		
		String response1 = given().log().all().header("Content-Type", "application/json").body(inputdata.AddUser())
				.when().post("api/v1/create").then().log().all().assertThat().statusCode(200)
				.body("message", equalTo("Successfully! Record has been added.")).extract().response().asString();

		System.out.println(response1);

	}

}
