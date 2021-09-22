package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SeznamHomePage;

import java.util.concurrent.TimeUnit;

public class SeznamSearchTest {
  private WebDriver wd;


  @BeforeTest
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void loginTest(){
    SeznamHomePage homepage = new SeznamHomePage(wd);
    homepage.inputSomething("Skrabets");
    homepage.clickOnSearchButton();
  }

  @AfterTest(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }
}
