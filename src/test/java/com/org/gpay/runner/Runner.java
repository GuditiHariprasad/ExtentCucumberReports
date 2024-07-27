package com.org.gpay.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //features = {"C:\\Users\\Admin\\eclipse-workspace\\ACucumberBDD\\src\\test\\resources\\com\\ha\\features\\login1.feature","C:\\Users\\Admin\\eclipse-workspace\\ACucumberBDD\\src\\test\\resources\\com\\ha\\features\\login2.feature"},
        //features = {"src/test/resources/com/ha/features/login1.feature","src/test/resources/com/ha/features/login2.feature"},
        //features = {"src/test/resources/com/ha/features"},
        features = {"src/test/resources/features/login1.feature"},
        glue = {"com.org.gpay.stepdefinitions"},
        /*plugin = { "pretty", "json:targe,cucumber-reports/Cucumber.json",
                        "junit:target/cucumber-reports/Cucumber.xml",
                        "html:target/cucumber-reports"},*/
        //format = {"json:target/cucumber.json","html:target/cucumber-reports"},
//        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
//                "rerun:target/failedrerun.txt"},
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        dryRun=false,
        publish=true,
        //tags = "@SmokeTest"
        //tags = "@SmokeTest or @RegressionTest"
        //tags = "@SmokeTest or @RegressionTest or @End2EndTest"
        //tags = "@SmokeTest and @RegressionTest"
        //tags = "@End2EndTest and @RegressionTest"
        //tags = "@End2EndTest and @SmokeTest"
        //tags = "@End2EndTest and @RegressionTest and SmokeTest"
        //tags = "not @End2EndTest"
        //tags = "not @End2EndTest and not @SmokeTest"
        tags="@tag1 or @tag2 or @tag3"
)
public class Runner extends AbstractTestNGCucumberTests {

}


