package tests;

import lib.CoreTestCase;
import lib.ui.ArticlePageObject;
import lib.ui.MyListsPageObject;
import lib.ui.NavigationUI;
import lib.ui.SearchPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWorkTests extends CoreTestCase
{
  /*  @Test
    public void testHomeWork3_2() {

        SearchPageObject SearchPageObject = new SearchPageObject(this.driver);
        SearchPageObject.initSearchInput();


        WebElement assertElementHasText = this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/search_src_text"), "Cannot find search input", 5L);
        String article_title = assertElementHasText.getAttribute("text");
        Assert.assertEquals("We see unexpected title", "Search…", article_title);
    }
*/
    @Test
    public void testHomework3_3() {

        SearchPageObject SearchPageObject = new SearchPageObject(this.driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("idea");
        SearchPageObject.waitForSearchResult("Mental image or concept");
        SearchPageObject.clickCancelSearch();
        SearchPageObject.clickCancelSearch();
        SearchPageObject.waitForCancelButtonToDisappear();
    }



    /*@Test
    public void testHome4_5() {

        SearchPageObject SearchPageObject = new SearchPageObject(this.driver);
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Programming language");

        ArticlePageObject ArticlePageObject = new ArticlePageObject(this.driver);
        ArticlePageObject.waitForTitleElement();
        String article_title = ArticlePageObject.getArticleTitle();
        String nameOfFolder = "Learning programming";
        ArticlePageObject.addArticleToMyList(nameOfFolder);
        ArticlePageObject.closeArticle();

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Java");
        SearchPageObject.clickByArticleWithSubstring("Island of Indonesia");

        NavigationUI NavigationUI = new NavigationUI(this.driver);
        NavigationUI.clickMyList();

        MyListsPageObject MyListsPageObject = new MyListsPageObject(this.driver);
        MyListsPageObject.openFolderByName(nameOfFolder);
        MyListsPageObject.swipeByArticleToDelete(article_title);

        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@text='OK']"), "Cannot press OK button", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"), "Cannot close article, cannot find X link", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Cannot find 'Search Wikipedia' input", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.xpath("//*[contains(@text,'Search…')]"), "Java", "Cannot find search input", 5L);

        String search_second_article = "//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Island of Indonesia']";
        this.MainPageObject.waitForElementAndClick(By.xpath(search_second_article), "Cannot find Search Wikipedia input", 5L);
        this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Cannot find article title", 15L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.ImageView[@content-desc='More options']"), "cannot find button to open article options", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@text='Add to reading list']"), "Cannot find option to add article to reading list", 5L);
        this.MainPageObject.waitForElementAndClick(By.id("org.wikipedia:id/item_container"), "Cannot find the folder", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"), "Cannot close article, cannot find X link", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.FrameLayout[@content-desc='My lists']"), "Cannot find navigation button to My list", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.FrameLayout[@content-desc='My lists']"), "Cannot find navigation button to My list", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@text='" + nameOfFolder + "']"), "Cannot find created folder", 5L);
        this.MainPageObject.swipeElementToLeft(By.xpath("//*[@text='JavaScript']"), "Cannot find saved article");
        this.MainPageObject.waitForElementNotPresent(By.xpath("//*[@text='JavaScript']"), "cannot delete saved article", 10L);
        this.MainPageObject.waitForElementAndClick(By.xpath(search_second_article), "Cannot find Search Wikipedia input", 5L);
        this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Cannot find article title", 15L);
    }*/

   /* @Test
    public void testhome4_6() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Cannot find 'Search Wikipedia' input", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.xpath("//*[contains(@text,'Search…')]"), "Java", "Cannot find search input", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Programming language']"), "Cannot find Search Wikipedia input", 5L);
        this.MainPageObject.assertElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "We have not found title_text");
        this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Cannot find article title", 15L);
    }*/
}
