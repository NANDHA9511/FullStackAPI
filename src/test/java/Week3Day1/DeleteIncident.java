package Week3Day1;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident {


	@Test
	private void Delete() {
		RestAssured.baseURI="https://dev144115.service-now.com/api/now/table/incident";


		RestAssured.authentication=RestAssured.basic("admin","CDk/V1@bA0zr");
		//Add request
		//RequestSpecification input = RestAssured.given().contentType("application/json").when().body("{\"description\":\"Nandhakumar Quality Engineering UST Globals\"}");
		Response response = RestAssured.delete("/8c52d290972d31102c7878300153af93");
		System.out.println(response);
		int statusCode = response.getStatusCode();

		System.out.println("The ststus code is" +statusCode);


	}

}
