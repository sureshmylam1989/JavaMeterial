package com.json.delphix.interview;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class BartAPI {
	
/*Note: To run this below 3 dependencies are required to mention in pom file
	 
	 <!-- https://mvnrepository.com/artifact/org.json/json -->
	<dependency>
	    <groupId>org.json</groupId>
	    <artifactId>json</artifactId>
	    <version>20180813</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient -->
	<dependency>
	    <groupId>org.apache.httpcomponents</groupId>
	    <artifactId>httpclient</artifactId>
	    <version>4.5.8</version>
	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore -->
	<dependency>
	    <groupId>org.apache.httpcomponents</groupId>
	    <artifactId>httpcore</artifactId>
	    <version>4.4.11</version>
	</dependency>
 */
	
	public static URL url;
	public static HttpsURLConnection conn;
	public static HttpResponse response;

	public static void main(String[] args) {
		int intStatusCode = 0;
		String strResponseText = "";
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// The API(hard-coded) - This can be parameterized
		String strURL = "https://api.bart.gov/api/etd.aspx?cmd=etd&orig=MONT&key=MW9S-E7SL-26DU-VV8V&json=y";
		try {
			url = new URL(strURL);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		try {
			conn = (HttpsURLConnection) url.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			// This section fetches the response code and appends it into the input stream
			intStatusCode = conn.getResponseCode();
			if (intStatusCode == 200) {
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String inputLine = "";
				StringBuffer response = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				// Converting the response code to the String format
				strResponseText = response.toString();
				if (strResponseText == null) {
					System.out.println("API returned null response");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(
					"Exception occured while parsing the response and exception message is : " + e.getMessage());
		}
		// Closing the connection
		conn.disconnect();
		// Parsing the JSON response
		JSONArray jArrEtd = new JSONObject(strResponseText).getJSONObject("root").getJSONArray("station")
				.getJSONObject(0).getJSONArray("etd");
		// This section is for pulling out the exact time of the inquiry
		String time = new JSONObject(strResponseText).getJSONObject("root").getString("time");
		// In this section We are extracting the source location and the departure time
		String startingPoint = new JSONObject(strResponseText).getJSONObject("root").getJSONArray("station")
				.getJSONObject(0).getString("name");
		for (int i = 0; i < jArrEtd.length(); i++) {
			JSONObject dest = new JSONObject(jArrEtd.get(i).toString());
			String strDestination = dest.getString("destination");
			JSONArray est = dest.getJSONArray("estimate");
			for (int j = 0; j < est.length(); j++) {
				String trainDepart = est.get(j).toString();
				JSONObject jo = new JSONObject(trainDepart);
				String minutes = jo.get("minutes").toString();
				/*
				 * "minutes.length() <= 2" is added to ignore the trains which are leaving at
				 * the moment. This will throw an exception if any of the trains are leaving
				 */
				if (tm.size() < 10 && minutes.length() <= 2) {
					tm.put(Integer.parseInt(minutes), strDestination);
				}
			}
		}
		// Printing the trains list in desired format
		System.out.println("---------------------------------------");
		System.out.println(startingPoint + '\t' + time);
		System.out.println("---------------------------------------");
		for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.printf("%2d mins		%s%n",  entry.getKey(), entry.getValue());
		}
	}
}
