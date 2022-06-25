package pageObjects;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.AndroidDriverSingleton.getDriver;

public class SentLettersPage extends BasePO{

    @FindBy(id = "delete")
    private WebElement deleteButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement navigationDrawerButton;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,' me,')]")
    private WebElement letterButton;

    @FindBy(xpath = "//android.widget.LinearLayout//android.widget.TextView[@text='Trash']")
    private WebElement trashButton;

    public boolean isSentLetterDisplayed(String subject){
        String letterSubject = String.format("//android.view.View[contains(@content-desc, '%s')]", subject);
        return getDriver().findElement(By.xpath(letterSubject)).isDisplayed();
    }

    public SentLettersPage selectLetter(){
        Actions action = new Actions(AndroidDriverSingleton.getDriver());
        action.clickAndHold(letterButton).build().perform();
        return this;
    }

    public SentLettersPage clickDeleteButton(){
        deleteButton.click();
        return this;
    }

    public SentLettersPage clickNavigationDrawerButton(){
        navigationDrawerButton.click();
        return this;
    }

    public SentLettersPage clickTrashButton(){
        trashButton.click();
        return this;
    }
}
