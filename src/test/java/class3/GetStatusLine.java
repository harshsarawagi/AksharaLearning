package class3;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStatusLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users?page=2";
		
		Response res = RestAssured.get(url);
		
		String statusLine = res.getStatusLine();		
		
		System.out.println(statusLine);
	}

}
