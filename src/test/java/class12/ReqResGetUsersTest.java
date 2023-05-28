package class12;

import io.restassured.RestAssured;

public class ReqResGetUsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users";
		
		ReqResRootPOJO res = RestAssured
			.given()
				.queryParam("per_page", 3)
				.log().all()
			.when()				
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
				.extract().as(ReqResRootPOJO.class);
		
		String email = res.getData().get(1).getEmail();
		System.out.println(email);
	}

}
