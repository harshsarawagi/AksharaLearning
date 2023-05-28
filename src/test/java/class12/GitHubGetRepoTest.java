package class12;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class GitHubGetRepoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://api.github.com/repos/{owner}/{repo}";
		
		GitHubGetRepoRootPOJO res = RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_may_06_02")
			.when()
				.log().all()
				.get(url)
			.then()
				.log().all()
				.statusCode(200)
				.extract().as(GitHubGetRepoRootPOJO.class);
		
		MatcherAssert.assertThat(res.getName(), Matchers.equalTo("repo_may_06_02"));
		MatcherAssert.assertThat(res.getOwner().getLogin(), Matchers.equalTo("orgchandra-B73"));
		
		//res.getName();
	}

}
