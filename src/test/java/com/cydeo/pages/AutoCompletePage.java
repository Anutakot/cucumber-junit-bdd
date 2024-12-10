package com.cydeo.pages;


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;

public class AutoCompletePage {

    private By submitButton = By.xpath("//input[@type='button']");


    public  void clickSubmitButton(){
        BrowserUtils.waitUntilElementIsVisible(Driver.get().findElement(submitButton));
        Driver.get().findElement(submitButton).click();
    }

    public void visit(){
        Driver.get().navigate().to(ConfigurationReader.getValue("url")+"/autocomplete");
    }
}
