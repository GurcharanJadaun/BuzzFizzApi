package Aisera.Task1;

import org.testng.annotations.Test;

import utility.ApiHandler;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestFizzBuzz {
	
	@Test(dataProvider="testData")
  public void testBuzzFizz(String inputData,String expectedResult) {
		ApiHandler api = new ApiHandler();
		String output = api.buzzFizz(inputData);
		
		Assert.assertEquals(output, expectedResult, "<< Api Test failed >>");
		}
  
	@DataProvider(name = "testData")
	public Object[][] testData() {
		Object[][] obj = {{"2","Invalid Input"},{"6","fizz"},{"10","buzz"},{"15","fizz buzz"},{"ab","Invalid Input"},{"","Status code : 404"}};
		
		return obj;
	}
}
