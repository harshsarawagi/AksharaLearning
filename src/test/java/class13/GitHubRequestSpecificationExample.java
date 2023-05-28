package class13;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class GitHubRequestSpecificationExample {

	public static void main(String[] args) {
		//RestAssured.baseURI = "https://api.github.com";
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.addHeader("Authorization", "Bearer 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");
		reqBuilder.addHeader("accept", "application/vnd.github+json");
		reqBuilder.setBaseUri("https://api.github.com");
				
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectHeader("Server", Matchers.equalTo("GitHub.com"));
		builder.expectHeader("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));
					
		RestAssured.requestSpecification = reqBuilder.build();
		RestAssured.responseSpecification = builder.build();
				
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
