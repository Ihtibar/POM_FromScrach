package Tests;

import Tests.Pages.Elements;
import Utility.MyLibrary;
import Utility.TestBase;
import Utility.credentials;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest extends TestBase {
    //-When we try to import library of the some methods in maven , all we need to do is write the dependincy ,
    //-When we chose the dependency we have to chose the (org.testng) one .
    //-In testNG we don't use main method, because it will run the application as testNG , (junit will same as testNG)
    //and main method is the method to run the java application.



    /*
       -When we try to import library of the some methods in maven , all we need to do is write the dependincy ,
       -When we chose the dependency we have to chose the (org.testng) one .
       -In testNG we don't use main method, because it will run the application as testNG , (junit will same as testNG)
       and main method is the method to run the java application.
     */



    @BeforeMethod
    public void setup2(){

        Elements e=new Elements();
        e.loginprocess();
    }



    @Test(priority = 1)
    public void FirstTest(){




    }

//    @Test(priority = 2)
//    public void SecondTest() {
//
//
//    }
//
//    @Test(priority = 3)
//    public void ThirdTest() {
//
//    }



    }









