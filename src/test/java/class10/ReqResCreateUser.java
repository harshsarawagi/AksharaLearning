package class10;

import java.io.FileNotFoundException;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqResCreateUser {

	public static void main(String[] args) throws FileNotFoundException {
		
		String url = "https://reqres.in/api/users";
		
		ReqResCreateUserPOJO obj = new ReqResCreateUserPOJO();
		
		obj.setName("Chandra");
		obj.setJob("Leader");
		
		ReqResCreateUserResponsePOJO res = RestAssured
			.given()
				.body(obj)
				.contentType(ContentType.JSON)
			.when()
				.log().all()
				.post(url)
			.then()
				.log().all()
				.statusCode(201)
				.extract().as(ReqResCreateUserResponsePOJO.class);
		
		String name = res.getName();
		String job = res.getJob();
		
		System.out.println(name);
		System.out.println(job);
		
		MatcherAssert.assertThat(job, Matchers.equalTo("Leader"));
	}
}
