package Week3Day1;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident {


	@Test
	public void create() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://dev144115.service-now.com/api/now/table/incident";


		RestAssured.authentication=RestAssured.basic("admin","CDk/V1@bA0zr");

		RequestSpecification input = RestAssured.given().contentType("application/json").when().body("{\"description\":\"Nandhakumar Quality Engineering UST Globals\"}");

		Response response = input.post();
		String sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("The sys_id is-"+sys_id);

		int statusCode = response.getStatusCode();

		System.out.println("The ststus code is" +statusCode);


	}
}
