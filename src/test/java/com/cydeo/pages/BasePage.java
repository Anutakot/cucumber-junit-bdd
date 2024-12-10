package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import config_reader.ConfigReader;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        //                       WebDriver  ,  Object
        PageFactory.initElements( Driver.get(),this);

    }

    public void visit(String endpoint){
        Driver.get().navigate().to(ConfigurationReader.getValue("url")+endpoint);
    }
}
