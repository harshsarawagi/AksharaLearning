package class8;

import java.util.List;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ReqResExtractResponseBodyJsonPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String url = "https://reqres.in/api/users/{id}";
//		
//		JsonPath jPath = RestAssured
//			.given()
//				.pathParam("id", 5)
//				.log().all()
//			.when()
//				.get(url)
//			.then()
//				.log().all()
//				.statusCode(200)
//				.extract().jsonPath();
//		
//		String email = jPath.getString("data.email");
//		System.out.println(email);
//		
//		MatcherAssert.assertThat(email, Matchers.equalTo("charles.morris@reqres.in"));
		
		
		
		
		String url = "https://reqres.in/api/users?per_page=5";
		
		JsonPath jPath = RestAssured
			.given()
				.log().all()
			.when()
				.post(url)
			.then()
				.log().all()
				.statusCode(200)
				.extract().jsonPath();
		
		List<String> allEmails = jPath.getList("data.email");
		
	}

}
