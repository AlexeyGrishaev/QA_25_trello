package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBoard extends HelperBase {
    public HelperBoard(WebDriver driver) {
        super(driver);
    }

    By btnCreateNewBoard = By.xpath("//li[@data-testid='create-board-tile']");
    By inputBoardTitle = By.xpath("//input[@data-testid='create-board-title-input']");
    By btnCreateSubmit = By.xpath("//button[@data-testid='create-board-submit-button']");
    By boardTitle = By.xpath("//h1[@data-testid='board-name-submit-button']");

    By btnDots = By.xpath("//button[@aria-label='Show menu']");
    By btnCloseBoard = By.xpath("//ul[@class='board-menu-navigation']/li[last()]/a");
    By btnCloseConfirm = By.xpath("//input[@value='Close']");
    By btnDeleteConfirm = By.xpath("//button[@data-testid='close-board-delete-board-confirm-button']");
    By textBoardTitleRequired = By.xpath("//p[text()='Board title is required']");
    By btnDelete = By.xpath("//button[@data-testid='close-board-delete-board-button']");
    By popUpMessageBoardDeleted = By.xpath("//span[@class='QMKgZFIlTLiEJN']");
    public void createNewBoard(String boardTitle) {
        clickBase(btnCreateNewBoard);
        pause(3);
        typeBase(inputBoardTitle, "QA-" + boardTitle);
        clickBase(btnCreateSubmit);

    }

    public boolean isTextInElementPresent_BoardDeleted() {
        return isTextInElementEquals(popUpMessageBoardDeleted, "Board deleted.");
    }
    public boolean isTextInElementEquals_boardTitle(String text) {
        pause(3);
        return isTextInElementEquals(boardTitle, text);
    }
    public void deleteBoard(String boardTitle) {
        clickBase(btnDots);
        pause(3);
        clickBase(btnCloseBoard);
        clickBase(btnCloseConfirm);
        clickBase(btnDelete);
        clickBase(btnDeleteConfirm);
    }
    public boolean isElementPresent_textBoardTitleRequired() {
        return isElementPresent(textBoardTitleRequired);
    }
    public boolean isAttributeDisabled() {
        WebElement element = driver.findElement(btnCreateSubmit);
        return !element.isEnabled();
    }
}
