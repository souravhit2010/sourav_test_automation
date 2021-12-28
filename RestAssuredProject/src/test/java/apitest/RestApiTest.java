package apitest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestApiTest {
	
	@Test
	public void test01()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		if(response.getStatusCode()==200)
		{
			System.out.println("Service is returning 200 Success response successfully");
		}
		else
		{
			System.out.println("Service is not returning 200 Success response");
		}
		
	}

}
