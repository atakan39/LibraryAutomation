package com.library.pages;

import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputEmail")
    public WebElement userbox;

    @FindBy(id = "inputPassword")
    public WebElement passbox;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    public WebElement loginBTn;


    public void loginLibrarian(){
        this.userbox.sendKeys(ConfigurationReader.getProperty("librarianUser"));
        this.passbox.sendKeys(ConfigurationReader.getProperty("librarianPass"));
        this.loginBTn.click();

    }

    public void loginStudent(){
        this.userbox.sendKeys(ConfigurationReader.getProperty("studentUser"));
        this.passbox.sendKeys(ConfigurationReader.getProperty("studentPass"));
        this.loginBTn.click();
    }






}
