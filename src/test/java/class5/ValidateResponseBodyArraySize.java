package class5;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidateResponseBodyArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?per_page=5";

		Response res = RestAssured.get(url);

		// res.prettyPrint();
		JsonPath jPath = res.jsonPath();
		
		int arraySize = jPath.getInt("data.size()");
		System.out.println(arraySize);
		
		MatcherAssert.assertThat(arraySize, Matchers.equalTo(5));
	}

}
