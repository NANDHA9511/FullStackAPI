package Week3Day1;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParams {
	@Test
	private void GetQueryParams() {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://dev144115.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "CDk/V1@bA0zr");
		
		HashMap<String, String> queryParam = new HashMap<String, String>();
		queryParam.put("sysparm_fields", "short_description,sys_id");
		queryParam.put("sysparm_limit", "1");
		
		RequestSpecification queryParams = RestAssured.given()
		.queryParams(queryParam);
		
		Response response = queryParams.get();
		response.prettyPrint();
	}

}
