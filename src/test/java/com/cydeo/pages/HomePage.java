package com.cydeo.pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class HomePage extends BasePage{

    @FindBy(xpath = "//test")
    public WebElement testElement;

    public void visit() {
        super.visit("/");
    }
}
