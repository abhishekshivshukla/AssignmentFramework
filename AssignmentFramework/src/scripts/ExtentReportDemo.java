package scripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	public static void main(String[] args) throws Exception {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./extentreports/report1.html");
		reporter.config().setReportName("report1");
		reporter.config().setDocumentTitle("bluestonetestreport");
		reporter.config().setTheme(Theme.STANDARD);
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(reporter);
		ext.setSystemInfo("project", "bluestone");
		ext.setSystemInfo("version", "1.0");
		ext.setSystemInfo("test engineer", "abhishek");
		ExtentTest test1 = ext.createTest("testMethod1");
		test1.log(Status.INFO, "test1 is stable");
		test1.log(Status.PASS, "test1 is Passed");
		test1.addScreenCaptureFromPath("C:\\Users\\Shiv\\git\\AssignmentFramework\\screenshots\\scenario1Sun Mar 31 16_55_11 IST 2019.png");
		ExtentTest test2 = ext.createTest("testMethod2");
		test2.log(Status.INFO, "test2 is stable");
		test2.log(Status.PASS, "test2 is Passed");
		test2.addScreenCaptureFromPath("C:\\Users\\Shiv\\git\\AssignmentFramework\\screenshots\\scenario2Sun Mar 31 16_55_29 IST 2019.png");
		ExtentTest test3 = ext.createTest("testMethod3");
		test3.log(Status.INFO, "test3 is stable");
		test3.log(Status.PASS, "test3 is Passed");
		test3.addScreenCaptureFromPath("C:\\Users\\Shiv\\git\\AssignmentFramework\\screenshots\\scenario3Sun Mar 31 16_56_44 IST 2019.png");
		ext.flush(); // publish the report
		System.out.println("Report Published");		
	}
}
