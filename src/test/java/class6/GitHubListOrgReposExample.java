package class6;

import io.restassured.RestAssured;

public class GitHubListOrgReposExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https://api.github.com/orgs/{orgName}/repos";
		
		RestAssured
			.given()
				.pathParam("orgName", "orgchandra-B73")
				.queryParam("per_page",1)
				.queryParam("sort", "Updated")
				.log().all()
			.when()
				.get(url)
			.then()
				.log().all()
				.statusCode(200);
				
	}

}
