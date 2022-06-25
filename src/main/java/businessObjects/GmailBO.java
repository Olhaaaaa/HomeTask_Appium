package businessObjects;

import pageObjects.*;

public class GmailBO {
    private final InitialPage initialPage;
    private final ComposePage composePage;
    private final IncomeLettersPage incomeLettersPage;
    private final SentLettersPage sentLettersPage;
    private final TrashPage trashPage;

    public GmailBO(){
        initialPage = new InitialPage();
        composePage = new ComposePage();
        incomeLettersPage = new IncomeLettersPage();
        sentLettersPage = new SentLettersPage();
        trashPage = new TrashPage();
    }

    public GmailBO skipInitialPage(){
        initialPage
                .clickGotItButton()
                .clickTakeMeToGmailButton();
        return this;
    }

    public GmailBO sendLetter(String recipient, String subject, String body){
        incomeLettersPage.clickComposeButton();
        composePage
                .clickPopUpOKButton()
                .typeRecipient(recipient)
                .typeSubject(subject)
                .typeLetter(body)
                .clickSend();
        return this;
    }

    public GmailBO openSentLetters(){
        incomeLettersPage
                .clickNavigationDrawerButton()
                .clickSentButton();
        return this;
    }
    public GmailBO selectAndDeleteLetter(){
        sentLettersPage
                .selectLetter()
                .clickDeleteButton();
        return this;
    }
    public GmailBO openTrash(){
        sentLettersPage
                .clickNavigationDrawerButton()
                .clickTrashButton();
        return this;
    }
    public boolean isLetterDeleted(String body){
        return trashPage.isDeletedLetterDisplayed(body);
    }

    public boolean isLetterSent(String subject){
        return sentLettersPage.isSentLetterDisplayed(subject);
    }


}
