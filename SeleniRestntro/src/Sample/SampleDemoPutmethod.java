package Sample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import files.inputdata;
import io.restassured.RestAssured;

public class SampleDemoPutmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://dummy.restapiexample.com";
		String response = given().log().all().header("Content-Type", "application/json").body(inputdata.UpdateUser())
				.when().put("api/v1/update/5").then().log().all().assertThat().statusCode(200)
				.body("message", equalTo("Successfully! Record has been updated.")).extract().response().asString();

		System.out.println(response);

	}

}
