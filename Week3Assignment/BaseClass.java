package Week3Assignment;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static String issueId;
	public static RequestSpecification req;
	public static Response resp;
	
	@BeforeMethod
	public void preCondition() {
		RestAssured.baseURI = "https://nandhas95.atlassian.net/rest/api/2/issue/";
		RestAssured.authentication = RestAssured.preemptive().basic("nandhaapi95@gmail.com", "ATATT3xFfGF06qKl9Z62quL9VTgqULo7BnQefpy_A9wewxiJ3HXgC0viDw4VMf8Biv6Do8GA3DTlg2Sft9zY6RiVTbszcJEveHStXLKSkveu70N34sDOw2TbbJlBayJslp0ebMfPgFsxcrQV4jX_mo2s7QsY9zisMpQntigwLe7WTbTZaWVgX2U=887AC87C");
		
		
	}
	

}
