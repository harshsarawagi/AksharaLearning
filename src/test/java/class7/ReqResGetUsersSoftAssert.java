package class7;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class ReqResGetUsersSoftAssert {

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
				.body(
						"data.size()", Matchers.equalTo(5),
						"data.first_name", Matchers.hasItem("Ema"),
						"support", Matchers.hasKey("txt"),
						"data[2].email", Matchers.containsString("ong"),
						"data[2].id", Matchers.greaterThan(4)
						
						);
	}

}
