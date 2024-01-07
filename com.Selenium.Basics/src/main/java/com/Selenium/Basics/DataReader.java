package com.Selenium.Basics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	@Test
	public static List<HashMap<String, String>> getJsonDataToMap() throws IOException {

		// Read Json to String

		File fl = new File(
				"C:\\Users\\Rahul Nishad\\eclipse-workspace\\com.Selenium.Basics\\src\\main\\resources\\ContainsData.json");
		String Jsonfile = FileUtils.readFileToString(fl, StandardCharsets.UTF_8);

		// Convert String to HaspMap using Jackson DataBind

		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(Jsonfile,
				new TypeReference<List<HashMap<String, String>>>() {
				});

		return data;
	}

}
