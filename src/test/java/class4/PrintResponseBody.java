package class4;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PrintResponseBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://reqres.in/api/users/5";
		
		Response res = RestAssured.get(url);
		
		res.print();
		System.out.println("---------------------------------------------------");
		res.prettyPrint();
		System.out.println("---------------------------------------------------");
		String responseBody = res.getBody().asPrettyString();
		System.out.println(responseBody);
	}

}
