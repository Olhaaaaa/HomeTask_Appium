import businessObjects.GmailBO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_GmailLogin extends BaseTest{
    private final GmailBO gmailBO =new GmailBO();

    private final String recipient = "olha.bednarska.24@gmail.com";
    private final String subject = "Appium test "; // + getSystemCurrentDate();
    private final String body = "Epam HomeWork";

    @Test
    public void isLetterSentTest(){
        gmailBO
                .skipInitialPage()
                .sendLetter(recipient, subject, body)
                .openSentLetters();
        Assert.assertTrue(gmailBO.isLetterSent(subject));
    }

    @Test
    public void checkDeletionOfSentLetterTest(){
        gmailBO
                .skipInitialPage()
                .openSentLetters()
                .selectAndDeleteLetter()
                .openTrash();
        Assert.assertTrue(gmailBO.isLetterDeleted(body));
    }
}
