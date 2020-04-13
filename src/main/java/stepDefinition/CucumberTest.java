package main.java.stepDefinition;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class CucumberTest {
	
	 public static RequestSpecification request;
	 
	public CucumberTest(){
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost:8080/");
		builder.setContentType(ContentType.JSON);
		RequestSpecification requestSpec = builder.build();
		request = RestAssured.given().spec(requestSpec);
	}
	
    public static ResponseOptions<Response> GetApi(String url)  {
        return request.get(url);
    }

	public static ResponseOptions<Response> GetApiwithParams(String url,HashMap<String,String> pathParams) {
		request.pathParams(pathParams);
		return request.get(url);
	}
}
