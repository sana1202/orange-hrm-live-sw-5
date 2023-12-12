package com.orangehrmlive.demo.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TestClass {
    @Test
    public void extentTest() throws IOException                  //for browse in line 45
    {
        //Create the object of ExtentReport
        ExtentReports reports = new ExtentReports();


        //spark Reporter
        ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");             //Path of the file should be given

        //Report Theme , Reort Title and Report Name
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Nop Commerce");                                 //Orelse html file will be generated
        spark.config().setDocumentTitle("Automation");

        reports.attachReporter(spark);                                                //attach the spark to Report

        //add System information
        reports.setSystemInfo("Os" , System.getProperty("os.name"));
        reports.setSystemInfo("Java version" , System.getProperty("java.version"));
        reports.setSystemInfo("Browser" , "Chrome");
        reports.setSystemInfo("Browser Version" , "119.1.2");

        ExtentTest test = reports.createTest("Login Test").assignAuthor("Jay").assignCategory("Smoke");  //Create the test
        test.pass("Login Test start Successfully");
        test.info("Url is loaded");
        test.info("values entered");
        test.pass("Login test completed successfully");

        //How to highlight the step
        test.pass(MarkupHelper.createLabel("Login test completed successfully" , ExtentColor.GREEN));

        ExtentTest test1 = reports.createTest("HomePage Test").assignAuthor("Prime") .assignCategory("Sanity");  //Create the test
        test1.pass("Home Page Test start Successfully");
        test1.info("Url is loaded");
        test1.info("values entered");
        test1.pass("HomePage test completed successfully");

        //How to highlight the step
        test1.fail(MarkupHelper.createLabel("HomePage test completed successfully" , ExtentColor.RED));

        reports.flush();                                  //Unless you can call this method report will not be generated with logs

        Desktop.getDesktop().browse(new File("extent.html").toURI());
        //This will open the file in the desktop default browser
        //If u press L , u can change the theme in the report
    }
}
