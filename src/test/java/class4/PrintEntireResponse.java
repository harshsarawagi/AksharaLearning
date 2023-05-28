package class4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintEntireResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users/2";
		
		Response res = RestAssured.get(url);
		
		res.peek();
		System.out.println("----------------------------------------------------------");
		res.prettyPeek();
	}

}
