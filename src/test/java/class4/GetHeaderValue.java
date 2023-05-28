package class4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetHeaderValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://reqres.in/api/users?page=2";
		
		Response res = RestAssured.get(url);
		
		String serverVal = res.getHeader("Server");
		String contentTypeVal = res.getHeader("Content-Type");
		
		System.out.println(serverVal);
		System.out.println(contentTypeVal);
		System.out.println("----------------------------------------------");
		System.out.println(res.getHeaders().toString());
		
	}

}
