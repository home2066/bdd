package Sample;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

	public static JsonPath rawToJson(String response) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(response);

		return js;
	}

}
