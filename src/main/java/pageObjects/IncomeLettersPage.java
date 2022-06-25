package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomeLettersPage extends BasePO{
    @FindBy(id = "compose_button")
    private WebElement composeButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement navigationDrawerButton;

    @FindBy(xpath = "//android.widget.LinearLayout//android.widget.TextView[@text='Sent']")
    private WebElement sentButton;

    public IncomeLettersPage clickComposeButton(){
        composeButton.click();
        return this;
    }

    public IncomeLettersPage clickNavigationDrawerButton(){
        navigationDrawerButton.click();
        return this;
    }

    public IncomeLettersPage clickSentButton(){
        sentButton.click();
        return this;
    }
}
