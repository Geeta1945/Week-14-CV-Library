package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="JobSearch")
    public static Object[][] objectTestData(){
      return new Object[][]{
              {"Research Scientist", "Hanney, Oxfordshire", "up to 1 miles", "400", "500", "Per day","Contract", "Contract Research Scientist jobs in SS12 0NY"},
              {"Tester", "Watford, Surrey", "up to 10 miles", "40000", "60000", "Per annum","Contract", "Contract Tester jobs in Watford"},
              {"Software Tester", "Hertfordshire", "up to 2 miles", "30000", "500000", "Per annum","Permanent", "Permanent Software Tester jobs in Crawley"},
              {"Software Automation Tester", "Harrow", "up to 7 miles", "30000", "50000", "Per annum","Contract", "Contract Software Automation Tester jobs in Harrow on the Hill"},
              {"Retail Manager", "Hounslow, Greater London", "up to 1 miles", "30000", "50000", "Per annum","Permanent", "Permanent Retail Manager jobs in Horley"},
      };
    }
}