package class11;

import io.restassured.RestAssured;

public class ReqResGetUserTest {

	public static void main(String[] args) {
		String url = "https://reqres.in/api/users/5";
		
		ReqResRootPOJO res = RestAssured
			.given()
			.when()
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
				.extract().as(ReqResRootPOJO.class);
		
		String email = res.getData().getEmail();
		System.out.println(email);
		
		System.out.println(res.getSupport().getText());
	}
}
