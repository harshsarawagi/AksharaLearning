package class6;

import io.restassured.RestAssured;

public class GitHubGetRepoWithToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://api.github.com/repos/{owner}/{repo}";
		
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_apr_26_03")
			.when()
				.log().all()
				.get(url)
			.then()
				.log().all()
				.statusCode(200);
	}

}
