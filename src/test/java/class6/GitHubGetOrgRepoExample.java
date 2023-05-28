package class6;

import io.restassured.RestAssured;

public class GitHubGetOrgRepoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://api.github.com/repos/{owner}/{repo}";
		
		RestAssured
			.given()
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_0.06603734920928472")
			.when()
				.log().all()
				.get(url)
			.then()
				.log().all()
				.statusCode(200);
	}

}
