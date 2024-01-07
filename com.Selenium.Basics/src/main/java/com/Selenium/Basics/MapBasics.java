package com.Selenium.Basics;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class MapBasics {

	@DataProvider
	public static Object[][] Sendata() throws IOException {
//		HashMap<String,String> map=new HashMap<String,String>();
//		map.put("name", "Rahul Nishad");
//		map.put("email", "Rahulsahani285@gmail.com");
//		map.put("phone", "8692035311");
		
		
		List<HashMap<String,String>> map=DataReader.getJsonDataToMap();
		
		
		return new Object[][] {{map.get(0)},{map.get(1)},{map.get(2)}};
	//takedatafromhashmap(map);

	}

	@Test(dataProvider = "Sendata", dataProviderClass = MapBasics.class)
	public static void takedatafromhashmap(HashMap<String, String> data) {
		System.out.println(data.get(0) + "" + data.get(1) + "" + data.get(2));

	}

}
