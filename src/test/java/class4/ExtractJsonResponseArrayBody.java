package class4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractJsonResponseArrayBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?page=2";
		
		Response res = RestAssured.get(url);
		
		//res.prettyPrint();
		
		JsonPath jPath = res.jsonPath();
		
		int total = jPath.getInt("total");
		System.out.println(total);
		
		int firstIdVal = jPath.getInt("data[0].id");
		System.out.println(firstIdVal);
		
		String emailVal = jPath.getString("data[2].email");
		System.out.println(emailVal);
		
		System.out.println(jPath.getString("data[2]"));
		System.out.println(jPath.getString("data.email[2]"));
		
		System.out.println(jPath.get("data.first_name"));
	}

}
