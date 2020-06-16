package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.junit.Assert;

import static genericLib.GlobalVariable.*;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utility {
	
	public static RequestSpecBuilder builder = new RequestSpecBuilder();
	public static Response response;
	public static JsonPath jsonPathEvaluator;
	public static RequestSpecification request;
	
	public static void performPostWithBodyParameter() {
		HashMap<String, String> postContent = new HashMap<String, String>();
		postContent.put("name", "Benz list#8");
		postContent.put("iso_639_1", "en");
		try {
//			FileInputStream fs = new FileInputStream(new File("src\\main\\resources\\test.json"));
			String body=new String(Files.readAllBytes(Paths.get("src\\main\\resources\\test.json")));
			builder.setBaseUri(getBaseURI());
			builder.setContentType(ContentType.JSON);
			builder.addQueryParam("api_key", getAPIKey());
			builder.addHeader("Authorization", getAuthorization());
			builder.setRelaxedHTTPSValidation();

			RequestSpecification requestspec = builder.build();
			request = RestAssured.given().spec(requestspec);
			response = request.body(body).post("/list");
			System.out.println("Response:" + response.asString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void performGetwithListId(String listID) {
		
		builder.setBaseUri(getBaseURI());
		builder.setContentType(ContentType.JSON);
		builder.addQueryParam("api_key", getAPIKey());
		builder.addHeader("Authorization", getAuthorization());
		builder.setRelaxedHTTPSValidation();
		
		RequestSpecification requestspec = builder.build();
		request = RestAssured.given().spec(requestspec);
		response = request.get("/list/"+listID);
		
	}


}
