package class5;

import io.restassured.RestAssured;

public class RestAssuredBDDSynatxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://reqres.in/api/users?per_page=5";
		
		RestAssured
			.given()
			.when()
				.get(url)
			.then()
				.log().all()
				.statusCode(200);					
	}

}
