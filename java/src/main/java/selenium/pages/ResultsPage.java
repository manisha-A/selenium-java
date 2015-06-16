package selenium.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by manishaawasthi on 16/06/2015.
 */
public class ResultsPage extends PageObject {
    @FindBy(id = "s-results-list-atf")
    private WebElementFacade resultsList;

    @FindBy(id = "result_0")
    private WebElementFacade firstResult;

    public void results_list_exists(){
        assert resultsList.isDisplayed();
        assert resultsList.isPresent();
    }

    public void select_first_result(){
        WebElement bookTitle = firstResult.findElement(By.className("a-col-right"));
        WebElement bookImage = firstResult.findElement(By.tagName("img"));
        bookImage.click();
    }
}
