package selenium.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class CartPage extends PageObject {
    private static String ITEM_ADDED_CONFIRM_TEXT = "1 item was added to your basket";

    @FindBy(id = "confirm-text")
    private WebElementFacade confirmText;

    @FindBy(id = "add-to-cart-button")
    private WebElementFacade addToCartButton;

    @FindBy(id = "buybox")
    private WebElementFacade buyBox;

    @FindBy(className = "hlb-checkout-button")
    private WebElementFacade checkOutButton;

    public void is_on_cart_page(){
        waitForRenderedElements(By.id("buybox"));
        assert buyBox.isDisplayed();
        assert buyBox.isPresent();
    }
    public void add_to_cart(){
        addToCartButton.click();
    }

    public void assert_item_added(){
//        assert confirmText.getText().contains(ITEM_ADDED_CONFIRM_TEXT);
        assert checkOutButton.isDisplayed();
        assert checkOutButton.isPresent();
    }
}
