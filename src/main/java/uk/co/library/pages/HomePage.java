package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

/*
Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
Methods - enterJobTitle(String jobTitle), enterLocation(String location),
selectDistance(String distance), clickOnMoreSearchOptionLink(),
enterMinSalary(String minSalary), enterMaxSalary(String maxSalary), selectSalaryType(String
sType), selectJobType(String jobType),
clickOnFindJobsButton().
 */
public class HomePage extends Utility {
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @FindBy(xpath = ("//span[@class='mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button']"))
     WebElement acceptALL;
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    public void acceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void acceptMyAlert() {
        clickOnElement(acceptALL);
    }

    public void enterJobTitle(String jobTitle1) { //automation tester

        sendTextToElement(jobTitle, jobTitle1);
        Reporter.log("Enter job title ins search field"+ jobTitle.toString()+"<br>");
    }

    public void enterLocation(String location1) { //london

        sendTextToElement(location, location1);
        Reporter.log("enter location"+location.toString()+"<br>");
    }

    public void selectDistance(String distance) throws InterruptedException { //within 1 mile
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        Reporter.log("Select distance from dropdown"+distanceDropDown.toString()+"<br>");

    }

    public void clickOnMoreSearchOptionLink() { //click
        clickOnElement(moreSearchOptionsLink);
        Reporter.log("Click on more search link"+ moreSearchOptionsLink.toString()+"<br>");
    }

    public void enterMinSalary(String minSalary) { //40000

        sendTextToElement(salaryMin, minSalary);
        Reporter.log("Enter Salary Min"+salaryMin.toString()+"<br>");
    }

    public void enterMaxSalary(String maxSalary) {

        sendTextToElement(salaryMax, maxSalary);
        Reporter.log("Select salaryMax"+ salaryMax.toString()+"<br>");

    }

    public void selectSalaryType(String sType) {

        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType); //Per annum
        Reporter.log("select salary type"+salaryTypeDropDown.toString()+"<br>");

    }

    public void selectJobType(String jobType) {

        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        Reporter.log("Select job Type"+jobTypeDropDown.toString()+"<br>");
    }

    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
        Reporter.log("CLick on findJobs button"+findJobsBtn.toString()+"<br>");
    }

}
