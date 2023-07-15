package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_home;
import org.example.pages.P02_register;

public class D01_registerStepDef {

    P01_home home = new P01_home();
    P02_register register = new P02_register();

    @Given("user go to register page")
    public void userGoToRegisterPage()
    {
        home.registerTab.click();
    }

    @And("user select gender type")
    public void userSelectGenderType() {
    }

    @And("user enter first name and last name")
    public void userEnterFirstNameAndLastName() {
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
    }

    @And("user enter email")
    public void userEnterEmail() {
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
    }
}
