package class7;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ReqResGetUserResponseBodyValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users/{id}";
		
		RestAssured
			.given()
				.pathParam("id", 5)
				.log().all()
			.when()
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
				.body("data.email", Matchers.equalTo("charles.morris@reqres.in"))
				.body("data.id", Matchers.equalTo(5))
				.body("support.url", Matchers.equalTo("https://reqres.in/#support-heading"));
	}

}
