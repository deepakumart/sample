package sample_Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Put {
	public static void main(String[] args) {
		RestAssured.baseURI="http://jsonplaceholder.typicode.com";
		String request="{\r\n"
				+ "    \"userId\": 1,\r\n"
				+ "    \"id\": 4,\r\n"
				+ "    \"name\": \"Deepak\",\r\n"
				+ "    \"place\": \"chennai\"\r\n"
				+ "  }"
				;
		Response response=null;
		try {
			response=RestAssured.given().contentType(ContentType.JSON).body(request).put("/posts/1");
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
		System.out.println("Response:"+response.asString());
	     
	     System.out.println("status"+response.getStatusCode());
	     if (response.getStatusCode()==201) {
	    	 System.out.println("pass");
			
		}
	     else {
			System.out.println("fail");
		}
	}

}

