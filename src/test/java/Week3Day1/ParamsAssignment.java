package Week3Day1;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ParamsAssignment {

	@Test
	public void TenParams() {

		RestAssured.baseURI = "https://dev144115.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "CDk/V1@bA0zr");

		HashMap<String, String> queryParms = new HashMap<String, String>();
		queryParms.put("sysparm_fields", "short_description,sys_id");
		queryParms.put("sysparm_limit", "10");

		RequestSpecification params = RestAssured.given()
				.queryParams(queryParms);

		Response response = params.get();

		response.prettyPrint();

		int statusCode = response.getStatusCode();

		System.out.println("The ststus code is" +statusCode);




	}
}
