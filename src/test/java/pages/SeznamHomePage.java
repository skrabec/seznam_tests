package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class SeznamHomePage {
    private WebDriver wd;

    private static String PAGE_URL="https://www.seznam.cz/";


    @FindBy(how = How.XPATH, using = "//*[@name='q']")
    private WebElement searchInputField;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement searchButton;

    public SeznamHomePage(WebDriver wd){
        this.wd=wd;
        wd.get(PAGE_URL);
        PageFactory.initElements(wd, this);
    }

    public void inputSomething(String text){
        searchInputField.click();
        searchInputField.clear();
        searchInputField.sendKeys(text);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }
}
