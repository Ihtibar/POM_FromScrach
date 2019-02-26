package Utility;

import Tests.YahooTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase  {

     public static  WebDriver driver;
     public MyLibrary mylib;
     public static WebDriverWait wait;
     public static Actions act;

    @BeforeMethod
    public void setups(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        mylib= new MyLibrary(driver);
        wait= new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        act = new Actions(driver);
    }

    @AfterMethod
    public void EndTest(){
        mylib.sleep(3);
        driver.quit();
    }
}
