package class8;

import io.restassured.RestAssured;

public class GitHubDeleteRepo {

	public static void main(String[] args) {
		String url = "https://api.github.com/repos/{owner}/{repo}";
		
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_0.06603734920928472")
			.when()
				.log().all()
				.delete(url)
			.then()
				.log().all()
				.statusCode(204);

	}

}
