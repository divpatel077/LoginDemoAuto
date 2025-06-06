package org.example.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Base {

    protected WebDriver driver;

    @BeforeClass
    public void initial(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @BeforeMethod
    public void BMethod(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterClass
    public void terminate() throws InterruptedException {
        Thread.sleep(5000);
        if(driver != null){
            driver.quit();
        }
    }


}
