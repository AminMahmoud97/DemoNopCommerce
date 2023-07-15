package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_home extends PageBase {

    @FindBy(className = "ico-register")
    public WebElement registerTab;

}
