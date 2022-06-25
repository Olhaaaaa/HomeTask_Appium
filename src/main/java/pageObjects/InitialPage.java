package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePO{

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItButton;

    @FindBy(id = "action_done")
    private WebElement takeMeToGmailButton;

    public InitialPage clickGotItButton(){
        gotItButton.click();
        return this;
    }

    public InitialPage clickTakeMeToGmailButton(){
        takeMeToGmailButton.click();
        return this;
    }
}
