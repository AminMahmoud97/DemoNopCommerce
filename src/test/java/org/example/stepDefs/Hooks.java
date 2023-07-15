package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;


    @Before
    public void openBrowser()
    {
        String browserName = ConfigReader.get("browserName");

        // step1 create new object from different browsers

        if (browserName.contains("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browserName.contains("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        // step2 Maximize
        driver.manage().window().maximize();

        // step3 implicitWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // step4 navigate to home page
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void quitDriver() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }

}
