package class4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractJsonResponseBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users/5";
		
		Response res = RestAssured.get(url);
		
		res.prettyPrint();
		
		//res.getBody().jsonPath();
		JsonPath jPath = res.jsonPath();
		
		int idVal = jPath.getInt("data.id");
		System.out.println(idVal);
		
		String emailVal = jPath.getString("data.email");
		System.out.println(emailVal);
		
		System.out.println(jPath.getString("support.url"));
	}

}
