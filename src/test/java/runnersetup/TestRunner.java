package runnersetup;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import net.masterthought.cucumber.util.*;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/config/StoryID-ListFunctionalityTest.feature", glue = "", tags = "@Debug", plugin = {
		"html:target/report/html/smoke", "json:target/report/smoke/json-report.json" })

public class TestRunner {

	@AfterClass
	public static void after() throws Throwable {
		System.out.println("Report");
		File reportOutputDirectory = new File("target/demo");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target\\report\\smoke\\json-report.json");
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
		System.out.println("End");
	}

}
