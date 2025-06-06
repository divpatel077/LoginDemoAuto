package org.example.LogInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
    WebDriver driver;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement Login;

    public login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setLogin(String name, String pass){
        username.sendKeys(name);
        password.sendKeys(pass);
        Login.click();
    }
}
