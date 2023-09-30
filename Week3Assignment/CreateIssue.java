package Week3Assignment;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateIssue extends BaseClass{
	@Test
	public void createIssue() {
		File file = new File("./src/test/resources/CreateIncident.json");
		
		req = RestAssured.given()
			.contentType("application/json")
			.when()
			.body(file);
		
		resp = req.post();
		
		int statusCode = resp.getStatusCode();
		
		issueId = resp.jsonPath().get("id");
		resp.then().assertThat().statusCode(Matchers.equalTo(201));
		
		System.out.println("Jira Issue ID: " + issueId);
		System.out.println("Status Code: " + statusCode);
		System.out.println(resp.prettyPrint());
	}

}
