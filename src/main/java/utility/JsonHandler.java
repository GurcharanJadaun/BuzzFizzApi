package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.path.json.JsonPath;

public class JsonHandler {
	

	public HashMap<String,String> getTestDataForFizzBuzz() {
		HashMap<String,String> output= new HashMap<String,String>();;
		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonarray=(JSONArray) parser.parse(new FileReader("src/resources/"+"testDataForFizzBuzz.json"));
			for(int i=0;i<jsonarray.size();i++) {
			JSONObject obj = (JSONObject) jsonarray.get(i);
				output.putAll(obj);
			}
			
		} catch (FileNotFoundException e) {		
			System.out.println("Exception:>>"+e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {	
			e.printStackTrace();
		}
		return output;
	}
}
