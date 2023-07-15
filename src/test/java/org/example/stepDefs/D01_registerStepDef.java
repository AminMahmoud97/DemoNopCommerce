package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_home;
import org.example.pages.P02_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_home home = new P01_home();
    P02_register register = new P02_register();

    @Given("user go to register page")
    public void userGoToRegisterPage()
    {
        home.registerTab.click();
    }

    @When("user select gender type")
    public void userSelectGenderType()
    {
        register.genderMale.click();
    }

    @And("user enter first name and last name")
    public void userEnterFirstNameAndLastName()
    {
        register.firstNameField.sendKeys(ConfigReader.get("firstName"));
        register.lastNameField.sendKeys(ConfigReader.get("lastName"));
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth()
    {
        Select selectDay = new Select(register.dayDateBirth);
        selectDay.selectByValue(ConfigReader.get("dayBirth"));

        Select selectMonth = new Select(register.monthDateBirth);
        selectMonth.selectByValue(ConfigReader.get("monthBirth"));

        Select selectYear = new Select(register.yearDateBirth);
        selectYear.selectByValue(ConfigReader.get("yearBirth"));
    }

    @And("user enter email")
    public void userEnterEmail()
    {
        Faker fake = new Faker();
        String email = fake.internet().safeEmailAddress();
        register.emailField.sendKeys(email);
        ConfigReader.set("email",email);
    }

    @And("user enter company")
    public void userEnterCompany()
    {
        register.companyField.sendKeys(ConfigReader.get("company"));
    }

    @And("user check newsLetter")
    public void userCheckNewsLetter()
    {
        if (register.newsLetterCheck.isSelected() != true)
        {
            register.newsLetterCheck.click();
        }

    }
    @And("user fills Password fields")
    public void userFillsPasswordFields()
    {
        register.passwordField.sendKeys(ConfigReader.get("password"));
        register.confirmPasswordField.sendKeys(ConfigReader.get("confirm.password"));
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.registerBtn.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(register.result.getText(),"Your registration completed");
        soft.assertEquals(register.result.getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();
    }


}
