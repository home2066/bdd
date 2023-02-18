package Sample;

import static io.restassured.RestAssured.given;

//import files.inputdata;
import io.restassured.RestAssured;

public class SampleDemoGetmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://dummy.restapiexample.com";
		given().log().all().header("Content-Type", "application/json").when().get("api/v1/employees").then().log().all()
				.assertThat().statusCode(200);
	}

}
