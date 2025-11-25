package com.example.automation.framework.reporting;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.example.automation.framework.reporting.ExtentManager;
import com.example.automation.framework.utils.ScreenshotUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentTestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("=== TEST SUITE STARTED ===");
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.getExtent().flush();
        System.out.println("=== TEST SUITE FINISHED ===");
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentManager.getExtent()
                .createTest(result.getMethod().getMethodName())
                .log(Status.INFO, "Test Started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.getExtent()
                .createTest(result.getMethod().getMethodName())
                .pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getMethod().getMethodName();

        String screenshotPath = ScreenshotUtil.captureScreenshot(testName);

        ExtentManager.getExtent()
                .createTest(testName)
                .fail("Test Failed: " + result.getThrowable(),
                        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build()
                );
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentManager.getExtent()
                .createTest(result.getMethod().getMethodName())
                .skip("Test Skipped");
    }
}
