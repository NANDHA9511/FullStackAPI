package Week3Day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident {

	@Test
	private void update() {


		RestAssured.baseURI="https://dev144115.service-now.com/api/now/table/incident";


		RestAssured.authentication=RestAssured.basic("admin","CDk/V1@bA0zr");
		//Add request
		RequestSpecification input = RestAssured.given().contentType("application/json").when().body("{\"description\":\"Nandhakumar Quality Engineering UST Globals\"}");

		Response response = input.put("/8c52d290972d31102c7878300153af93");
		String sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("The sys_id is-"+sys_id);

		int statusCode = response.getStatusCode();

		System.out.println("The ststus code is" +statusCode);




	}
}
