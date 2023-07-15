package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P02_register extends PageBase {

    @FindBy(css = "input[id=\"gender-male\"]")
    public WebElement genderMale;

    @FindBy(css = "input[id=\"FirstName\"]")
    public WebElement firstNameField;

    @FindBy(css = "input[id=\"LastName\"]")
    public WebElement lastNameField;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
    public WebElement dayDateBirth;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
    public WebElement monthDateBirth;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
    public WebElement yearDateBirth;

    @FindBy(css = "input[id=\"Email\"]")
    public WebElement emailField;

    @FindBy(css = "input[id=\"Company\"]")
    public WebElement companyField;

    @FindBy(css = "input[id=\"Newsletter\"]")
    public WebElement newsLetterCheck;

    @FindBy(css = "input[id=\"Password\"]")
    public WebElement passwordField;

    @FindBy(css = "input[id=\"ConfirmPassword\"]")
    public WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(css = "div[class=\"result\"]")
    public WebElement result;
}
