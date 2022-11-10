package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class HomePage extends PageObject {

    @FindBy(id = "shopping_cart_container")
    private WebElementFacade welcomeMessage;

    public boolean checkLogin() {
        return welcomeMessage.isPresent() && welcomeMessage.isDisplayed();
    }
}
