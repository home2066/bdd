package Sample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class SampleRealTimeWeatherApi {

	@Test

	public void weatherApi() {

		RestAssured.baseURI = "http://api.weatherapi.com";
		String basePath = "/v1/current.json?";
		String key_auth = "f2f6ccd7c78a4385ae5232943233001";
		String q = "Irving";
		String aqi = "no";
		int days = 7;

		String res = RestAssured.given().log().all().when()
				.get(basePath + "key=" + key_auth + "&q=" + q + "&aqi=" + aqi
						+ "days=" + days)
				.then().log().all().extract().response().asString();

		/*
		 * String res1 = RestAssured.given().when().basePath("v1/current.json")
		 * .pathParam("key", key_auth).pathParam("q", "irving")
		 * .pathParams("aqi", "no").pathParam("days", new Integer(7))
		 * .get("?key={key}&q={q}&aqi={aqi}&days={days}").then().log()
		 * .all().extract().response().asString();
		 */

		JsonPath js1 = ReusableMethods.rawToJson(res);
		String location = js1.getString("location.name");
		System.out.println(location);

		String temp = js1.getString("current.temp_c");
		System.out.println(temp);

	}

}
