package class5;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidateResponseJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?page=2";

		Response res = RestAssured.get(url);

		// res.prettyPrint();

		JsonPath jPath = res.jsonPath();

		int total = jPath.getInt("total");
		System.out.println(total);

		int firstIdVal = jPath.getInt("data[0].id");
		System.out.println(firstIdVal);

		String emailVal = jPath.getString("data[2].email");
		System.out.println(emailVal);
		
		//MatcherAssert will help compare actual and expected
		//first arg will be actual, second will be expected using Matchers
		MatcherAssert.assertThat(total, Matchers.equalTo(12));
		MatcherAssert.assertThat(firstIdVal, Matchers.equalTo(7));
		MatcherAssert.assertThat(emailVal, Matchers.equalTo("tobias.funke@reqres.in"));
		
	}

}
