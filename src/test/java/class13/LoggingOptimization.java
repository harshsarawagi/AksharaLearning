package class13;

import io.restassured.RestAssured;

public class LoggingOptimization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		
		RestAssured.baseURI = "https://api.github.com";
		
		String path = "repos/{owner}/{repo}";
		
		RestAssured
			.given()
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_may_18_01")
			.when()			
				.log().ifValidationFails()
				.get(path)
			.then()
				.log().ifValidationFails()
				.statusCode(200);
	}

}
