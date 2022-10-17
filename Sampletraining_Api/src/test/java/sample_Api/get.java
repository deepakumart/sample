package sample_Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	public static void main(String[] args) {
		
	Response response = RestAssured.given().baseUri("http://jsonplaceholder.typicode.com/posts").when().get();
	System.out.println(response.asPrettyString());
	RestAssured.given().baseUri("http://jsonplaceholder.typicode.com/posts").when().get().then().log().all();
     System.out.println(response.jsonPath().getString("id"));
     System.out.println(response.jsonPath().getString("title"));
}
}
