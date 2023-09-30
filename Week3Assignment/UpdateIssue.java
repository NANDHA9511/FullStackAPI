package Week3Assignment;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateIssue extends BaseClass{
	@Test(dependsOnMethods = "Week3Assignment.CreateIssue.createIssue")
	public void updateIssue() {
		File file = new File("./src/test/resources/UpdateIncident.json");
		
		req = RestAssured.given()
				.contentType("application/json")
				.when()
				.body(file);
		System.out.println("Jira Issue ID: " + issueId);
		resp = req.put("/"+issueId);
		
		int statusCode = resp.getStatusCode();
		System.out.println("Issue ID: " + issueId);
		System.out.println("Status code: " + statusCode);
		resp.then().assertThat().statusCode(Matchers.equalTo(204));
		resp.prettyPrint();
	}
	
}
