package com.qacart.pages;

import com.qacart.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class LoginScreen extends Base {


    @iOSXCUITFindBy (accessibility = "email")
    @AndroidFindBy (accessibility = "email")
    public MobileElement emailTextField;

    @iOSXCUITFindBy (accessibility = "password")
    @AndroidFindBy (accessibility = "password")
    public MobileElement passwordTextField;

    @iOSXCUITFindBy (accessibility = "login")
    @AndroidFindBy (accessibility = "login")
    public MobileElement loginButton;

    @iOSXCUITFindBy (accessibility = "error")
    @AndroidFindBy (accessibility = "error")
    public MobileElement errorMessage;



    public TasksScreen performLogin(String userName, String password) {
        emailTextField.sendKeys(userName);
        passwordTextField.sendKeys(password);
        loginButton.click();
        return new TasksScreen();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }











}
