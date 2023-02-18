package com.selenium.rest.testng;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		/* Rest Assured works with three principles or we can say its as methods
		 * Given  ---> All input details
		 * When   ---> Submitting the API -- resource and http methods
		 * Then   ---> validating the response
		 * 
		 * For using given method we need import the static method 
		 */
		
		given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
			
			.body("[\r\n"
					+ "    {\r\n"
					+ "        \"id\": 11,\r\n"
					+ "        \"name\": \"Krishna Rungta\",\r\n"
					+ "        \"username\": \"Bret\",\r\n"
					+ "        \"email\": \"Sincere@april.biz\",\r\n"
					+ "        \"address\": {\r\n"
					+ "            \"street\": \"Kulas Light\",\r\n"
					+ "            \"suite\": \"Apt. 556\",\r\n"
					+ "            \"city\": \"Gwenborough\",\r\n"
					+ "            \"zipcode\": \"92998-3874\",\r\n"
					+ "            \"geo\": {\r\n"
					+ "                \"lat\": \"-37.3159\",\r\n"
					+ "                \"lng\": \"81.1496\"\r\n"
					+ "            }\r\n"
					+ "        },\r\n"
					+ "        \"phone\": \"1-770-736-8031 x56442\",\r\n"
					+ "        \"website\": \"hildegard.org\",\r\n"
					+ "        \"company\": {\r\n"
					+ "            \"name\": \"Romaguera-Crona\",\r\n"
					+ "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\r\n"
					+ "            \"bs\": \"harness real-time e-markets\"\r\n"
					+ "        }\r\n"
					+ "    }\r\n"
					+ "]")
			.when().post("/maps/api/place/add/json")
			
			.then().log().all().assertThat().statusCode(200);
	}

}
