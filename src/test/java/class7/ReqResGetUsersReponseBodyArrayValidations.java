package class7;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ReqResGetUsersReponseBodyArrayValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users";
		
		RestAssured
			.given()
				.queryParam("per_page", 6)
				.log().all()
			.when()				
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
				.body("data.size()", Matchers.equalTo(6))
				.body("data.first_name", Matchers.hasItem("Emma"))
				.body("data.first_name", Matchers.hasItems("Emma","Charles","George"))
				.body("data.first_name", Matchers.contains("George","Janet","Emma","Eve","Charles","Tracey"))
				.body("data.first_name", Matchers.containsInAnyOrder("Charles","George","Janet","Emma","Eve","Tracey"))
				.body("support", Matchers.hasKey("text"))
				.body("data[2].email", Matchers.containsString("wong"))
				.body("data[2].id", Matchers.greaterThan(1));
	}

}
