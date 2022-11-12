package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class ApiHandler {
	public String buzzFizz(String input) {
		String result="";
		RequestSpecification requestSpec = new RequestSpecBuilder().build();
	  requestSpec.baseUri("http://localhost:2103/aisera/buzzFizz/" + input);
	  JsonPath path;
	
	  Response res=given().spec(requestSpec).get();
	 if(res.getStatusCode() == 200) {
	  path = new JsonPath(res.body().asString());
	 result = path.get("result");
	 }
	 else {
		 result = "Status code : " + String.valueOf(res.getStatusCode());
	 }
	return result;
	}
	
}
