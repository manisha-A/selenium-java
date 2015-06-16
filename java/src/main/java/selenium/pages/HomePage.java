package selenium.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class HomePage extends PageObject {
    @FindBy(id = "twotabsearchtextbox")
    private WebElementFacade searchBox;

    @FindBy(id = "nav-shop")
    private WebElementFacade homePage;

    public  void  is_on_amazon_home_page(){
        waitForRenderedElementsToBePresent(By.id("twotabsearchtextbox"));
        assert searchBox.isDisplayed();
    }

    public void search_item(String item){
        searchBox.sendKeys(item);
        searchBox.submit();
    }

    public void go_to_amazon_shopping(){
        getDriver().get("http://localhost:4444/wd/hub");
        getDriver().get("http://www.amazon.co.uk/");
    }

    public WebDriver set_grid() throws Exception{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/grid/register"),
                cap);
        return driver;
    }
}
