package sample_Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Delete {
	public static void main(String[] args) {
		RestAssured.baseURI="http://jsonplaceholder.typicode.com";
		String request="{\r\n"
				+ "  \"userId\": 1,\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\r\n"
				+ "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
				+ "}"
				;
		Response response=null;
		try {
			response=RestAssured.given().contentType(ContentType.JSON).body(request).delete("posts/1");
			
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

