package Week3Assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteIssue extends BaseClass{
	@Test(dependsOnMethods = "Week3Assignment.CreateIssue.createIssue")
	public void deleteIssue() {
		req = RestAssured.given()
				.contentType("application/json");
		
		resp = req.delete(issueId);
		
		System.out.println("Status Code: " +resp.getStatusCode());
		
		resp.then().assertThat().statusCode(Matchers.equalTo(204));
	}

}
