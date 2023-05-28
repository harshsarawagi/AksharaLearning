package class7;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ReqResHeaderValidations {

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
				.header("Server", Matchers.equalTo("cloudflare"))
				.header("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
	}

}
