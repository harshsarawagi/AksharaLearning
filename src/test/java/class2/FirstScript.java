package class2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?page=2";
		
		Response res = RestAssured.get(url);
		
		res.prettyPrint();
	}

}
