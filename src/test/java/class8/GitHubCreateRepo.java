package class8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GitHubCreateRepo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String url = "https://api.github.com/orgs/{org}/repos";
		
		FileInputStream fis = new FileInputStream("src/test/resources/inputjson/create_repo.json");
		
		RestAssured
			.given()
				.pathParam("org", "orgchandra-B73")
				.header("Authorization","Bearer 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")
				.body(fis)
				.contentType(ContentType.JSON)
			.when()
				.post(url)
			.then()
				.log().all()
				.statusCode(201);
	}

}
