package class10;

import java.io.FileInputStream;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GitHubCreateRepoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://api.github.com/orgs/{org}/repos";
		//generate random number
		//concatenate with repo_
		GitHubCreateRepoPOJO obj = new GitHubCreateRepoPOJO();
		obj.setName("repo_may20_01");
		obj.setDescription("Description from pojo");
		obj.setPrivateVal(true);
		
		RestAssured
			.given()
				.pathParam("org", "orgchandra-B73")
				.header("Authorization","Bearer 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")
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
