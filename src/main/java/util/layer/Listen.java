package util.layer;

import com.codeborne.selenide.Configuration;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("Your test started!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test success. " + "Class = " + result.getTestClass() + ". TestName = " + result.getTestName() + ".");
        Configuration.screenshots = true;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        Configuration.screenshots = true;
    }
}
