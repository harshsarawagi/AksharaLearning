package class9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GitHubUpdateRepo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String url = "https://api.github.com/repos/{owner}/{repo}";
		FileInputStream fis = new FileInputStream("src/test/resources/inputjson/update_repo.json");
		RestAssured
			.given()
				.header("Authorization","Bearer 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")
				.pathParam("owner", "orgchandra-B73")
				.pathParam("repo", "repo_may_18_02")
				.body(fis)
				.contentType(ContentType.JSON)
			.when()
				.log().all()
				.patch(url)
			.then()
				.log().all()
				.statusCode(200)
				.and().assertThat()
				.body("description", Matchers.equalTo("updated repo from API"));
		
	}

}
