package class13;

import io.restassured.RestAssured;

public class URLOptimizationExample {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://api.github.com";
		
		String path = "repos/{owner}/{repo}";
		
		RestAssured
			.given()
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_may_18_01")
			.when()
				.log().all()
				.get(path)
			.then()
				.log().all()
				.statusCode(200);
	}
}
