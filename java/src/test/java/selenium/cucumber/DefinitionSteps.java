package selenium.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import selenium.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Before
    public void beforeEveryScenario() throws Exception{
//        endUser.setup_grid();
        endUser.go_to_amazon_shopping();
        endUser.getDriver().manage().window().maximize();
    }

    @After
    public void afterEveryScenario(){
        endUser.getDriver().close();
        endUser.getDriver().quit();
    }

    @Given("^I am on amazon shopping home page$")
    public void i_am_on_amazon_shopping_home_page(){
        endUser.is_on_amazon_home_page();
    }

    @When("^I search for \"(.*?)\"$")
    public void search_for_book(String book){
        endUser.search_for_book(book);
    }

    @Then("^I should be able to add the book to my cart$")
    public void i_should_be_able_to_add_the_book_to_my_cart(){
        endUser.assert_book_added_to_cart();
    }

}
