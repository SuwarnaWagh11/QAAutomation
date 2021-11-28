package com.automation.webservices.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetData {

	@Test
	public void testResponseCode() {
/*		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);*/
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		RequestSpecification httpReq = RestAssured.given();
		
		Response resp = httpReq.request(Method.GET);
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().asString());
	}
}
