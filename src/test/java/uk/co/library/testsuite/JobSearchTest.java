package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;
/*
1.JobSearchTest
Inside JobSearchTest class create following testmethods
1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
distance, String salaryMin, String salaryMax, String salaryType, String jobType,
String result).
enter job title 'jobTitle'
enter Location 'location'
select distance 'distance'
click on moreSearchOptionsLink
enter salaryMin 'salaryMin'
enter salaryMax 'salaryMax'
select salaryType 'salaryType'
select jobType 'jobType'
click on 'Find Jobs' button
verify the result 'result'
 */

public class JobSearchTest extends TestBase {

    HomePage homePageObj;
    ResultPage resultPage;

    @BeforeMethod
    public void beforeMethod() {

        homePageObj = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "JobSearch",dataProviderClass = TestData.class,groups = {"smoke","sanity","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {

        homePageObj.acceptCookies();
        homePageObj.enterJobTitle(jobTitle);
        homePageObj.enterLocation(location);

        homePageObj.selectDistance(distance);
        homePageObj.clickOnMoreSearchOptionLink();

        homePageObj.enterMinSalary(salaryMin);

        homePageObj.enterMaxSalary(salaryMax);
        homePageObj.selectSalaryType(salaryType);
        homePageObj.selectJobType(jobType);

        homePageObj.clickOnFindJobsButton();
        resultPage.verifyResults(result);

    }


}
