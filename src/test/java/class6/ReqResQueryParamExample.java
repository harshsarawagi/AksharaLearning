package class6;

import io.restassured.RestAssured;

public class ReqResQueryParamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users";
		
		RestAssured
			.given()
				.queryParam("per_page", 3)
				.log().all()
			.when()				
				.get(url)
			.then()
				.log().all()
				.statusCode(200);
			
		
	}

}
