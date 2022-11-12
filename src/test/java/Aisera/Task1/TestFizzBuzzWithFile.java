package Aisera.Task1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ApiHandler;
import utility.JsonHandler;

import java.util.HashMap;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestFizzBuzzWithFile {
  HashMap<String,String> testData;
  @BeforeClass
  public void beforeClass() {
	  JsonHandler obj = new JsonHandler();  
	  testData = obj.getTestDataForFizzBuzz();
  }
  
	@Test(dataProvider="testData")
	  public void testBuzzFizzWithFile(String inputData,String expectedResult) {
			ApiHandler api = new ApiHandler();
			String output = api.buzzFizz(inputData);
			
			Assert.assertEquals(output, expectedResult, "<< Api Test failed >>");
			}
	  
  @DataProvider(name = "testData")
	public Object[][] testData() {
		
	  Set<String> dataSet = testData.keySet();
	  Object[][] obj = new Object[dataSet.size()][2];
		int index = 0;
		
		for(String data: dataSet) {
			Object[] ele = {data,testData.get(data)};
			obj[index] =  ele;
			index++;
		}
		return obj;
	}
  
}
