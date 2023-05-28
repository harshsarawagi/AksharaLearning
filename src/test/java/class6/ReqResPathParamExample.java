package class6;

import io.restassured.RestAssured;

public class ReqResPathParamExample {

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
				.statusCode(200);
	}

}
