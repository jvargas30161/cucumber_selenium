package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends BasePage {

    private By pageTileLocator = By.className("page-title");
    private String titlePage="Category: comics";

    //Los renombro, porque nos van a quedar los métodos propios de las páginas.
//    public By getPageTileLocator() {
//        return pageTileLocator;
//    }
//
//    public String getTitlePage() {
//        return titlePage;
//    }

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsplayed() throws Exception {
        return this.isDisplayed(pageTileLocator) && this.getText(pageTileLocator).equals(titlePage);
    }
}

