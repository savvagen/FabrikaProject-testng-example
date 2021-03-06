package com.Fabrika.UiObjects.Pages;


import com.Fabrika.UiObjects.Website;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {

    public static EventFiringWebDriver webDriver;
    public static WebDriverWait wait;
    public static Website website;

    public AboutPage(EventFiringWebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
        website = new Website(driver);

    }

    public static final String ABOUT_PAGE_URL = website.BASE_URL + "default/about";
    public static final String ABOUT_PAGE_TITLE = "About course";

}
