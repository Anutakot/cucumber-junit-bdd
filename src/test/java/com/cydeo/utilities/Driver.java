package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver() {

    }

    //instance
    private static WebDriver driver;  //you can not reach that field from the static method or bclok
    /*
    private static WebDriver getChromeDriver(){

        driver=new ChromeDriver();

        return driver;
    }
*/
    private static WebDriver getFirefoxDriver(){

        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }


//open browser method
    public static WebDriver get() {

        //it means that we don't have openned one browser
        if (driver == null) {
            String browserType = ConfigurationReader.getValue("browser");

            if (browserType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            } else if (browserType.equalsIgnoreCase("firefox")) {
                return getFirefoxDriver();
            }else {
                driver = new ChromeDriver();
                driver.manage().window().fullscreen();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }


        }

        return driver;
    }

    //close the browser

    public static void close(){
        if (driver!=null){
            driver.close();
            driver.quit();
            driver=null;
        }
    }


}
