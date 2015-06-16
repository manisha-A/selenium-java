package selenium.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import selenium.pages.CartPage;
import selenium.pages.HomePage;
import selenium.pages.ResultsPage;

public class EndUserSteps extends ScenarioSteps {

    HomePage homepage;
    ResultsPage resultspage;
    CartPage cartpage;

    @Step
    public void is_on_amazon_home_page(){
        homepage.is_on_amazon_home_page();
    }

    @Step
    public void search_for_book(String book){
        homepage.search_item(book);
    }

    @Step
    public void assert_book_added_to_cart(){
        resultspage.results_list_exists();
        resultspage.select_first_result();
        cartpage.is_on_cart_page();
        cartpage.add_to_cart();
        cartpage.assert_item_added();
    }

    @Step
    public void go_to_amazon_shopping(){
        homepage.go_to_amazon_shopping();
    }

    @Step
    public void setup_grid() throws Exception{
        homepage.set_grid();
    }
}