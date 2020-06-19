package step_definitions;

import static genericLib.Utility.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Steps_Common {

	private static JsonPath jsonPathEvaluator;

	@When("I perform POST operation for {string}")
	public void i_perform_POST_operation_for(String string) {
		performPostWithBodyParameter();
	}

	@Then("I should see status code {string}")
	public void i_should_see_status_code(String statusCode) {
		Assert.assertEquals(statusCode, Integer.toString(response.getStatusCode()));
		System.out.println("Print status code: " + response.getStatusCode());
	}

	@Then("I should see message {string} in the response body")
	public void i_should_see_message_in_the_response_body(String errorMessage) {
		jsonPathEvaluator = response.jsonPath();
		Assert.assertEquals(errorMessage, jsonPathEvaluator.get("status_message"));
		System.out.println("Print response as string: " + jsonPathEvaluator.get("status_message"));
	}

	@When("I perform GET operation for {string} with list id {string}")
	public void i_perform_GET_operation_for_with_list_id(String string, String listID) {
		performGetwithListId(listID);
	}

	@Then("I should see {string} in the response body")
	public void i_should_see_in_the_response_body(String listID) {
		jsonPathEvaluator = response.jsonPath();
		Assert.assertEquals(listID, Integer.toString(jsonPathEvaluator.get("id")));
		System.out.println("Print response as string: " + jsonPathEvaluator.get("id"));
		/*
		 * File reportOutputDirectory = new File("target/demo"); List<String> jsonFiles
		 * = new ArrayList<>(); jsonFiles.add("target/report/smoke/");
		 * 
		 * String buildNumber = "1"; String projectName = "BDD Report"; Configuration
		 * configuration = new Configuration(reportOutputDirectory, projectName);
		 * configuration.setBuildNumber(buildNumber);
		 * 
		 * configuration.addClassifications("Browser", "Chrome");
		 * configuration.addClassifications("Branch", "release/1.0");
		 * configuration.setSortingMethod(SortingMethod.NATURAL);
		 * configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		 * configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
		 * configuration.setQualifier("sample", "Some Qualifier"); // points to the demo
		 * trends which is not used for other tests configuration.setTrendsStatsFile(new
		 * File("target/test-classes/demo-trends.json"));
		 * 
		 * ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		 * reportBuilder.generateReports();
		 */

		/*
		 * try { after(); } catch (Throwable e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}


	public void after() throws Throwable {
		System.out.println("Report");
		File reportOutputDirectory = new File("target/demo");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("E:\\Benz\\api-automation-restassured-master\\ev-services-testsuite\\target\\report\\smoke\\json-report.json");
		// jsonFiles.add("cucumber-report-2.json");

		String buildNumber = "1";
		String projectName = "cucumberProject";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		// and here validate 'result' to decide what to do
		// if report has failed features, undefined steps etc
	}
}
