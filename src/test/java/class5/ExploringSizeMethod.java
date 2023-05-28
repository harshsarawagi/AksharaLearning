package class5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExploringSizeMethod {

	public static void main(String[] args) {
		//calling size method on array -> number of objects in that array
		//calling size method on object -> number of key value pairs in that object
		//calling size method on key -> number of chars in the value
		
		String url = "https://reqres.in/api/users?per_page=5";

		Response res = RestAssured.get(url);

		// res.prettyPrint();
		JsonPath jPath = res.jsonPath();
		
		int arraySize = jPath.getInt("support.url.size()");
		System.out.println(arraySize);

	}

}
