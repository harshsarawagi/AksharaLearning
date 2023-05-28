package class9;

import java.io.FileNotFoundException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqResCreateUser {

	public static void main(String[] args) throws FileNotFoundException {
		
		String url = "https://reqres.in/api/users";
		
		ReqResCreateUserPOJO obj = new ReqResCreateUserPOJO();
		
		obj.setName("Chandra");
		obj.setJob("Leader");
		
		RestAssured
			.given()
				.body(obj)
				.contentType(ContentType.JSON)
			.when()
				.log().all()
				.post(url)
			.then()
				.log().all()
				.statusCode(201);
	}
}
