package class3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStatusCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?page=2";
		
		Response res = RestAssured.get(url);
		
		int statusCode = res.getStatusCode();
		int statusCode1 = res.statusCode();		
		
		System.out.println(statusCode);
		System.out.println(statusCode1);
	}

}
