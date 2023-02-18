package Sample;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class SampleJsonFileAsInput {

	public static void main(String[] args) throws IOException {

		RestAssured.baseURI = "http://dummy.restapiexample.com";

		String response = given().header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths
						.get("D:\\PRIYA\\WORKSPACE\\RestAssured\\RestAssuredPostmanSample\\src\\files\\file.json"))))
				.when().post("/api/v1/create").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();

		System.out.println(response);

		JsonPath js1 = ReusableMethods.rawToJson(response);
		String name = js1.getString("employee_name");

		System.out.println(name);

	}

}
