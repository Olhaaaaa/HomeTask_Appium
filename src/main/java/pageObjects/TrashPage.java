package pageObjects;

import org.openqa.selenium.By;

import static driver.AndroidDriverSingleton.getDriver;

public class TrashPage extends BasePO{

    public boolean isDeletedLetterDisplayed(String body){
        String letterBody = String.format("//android.view.View[contains(@content-desc, '%s')]", body);
        return getDriver().findElement(By.xpath(letterBody)).isDisplayed();
    }

}
