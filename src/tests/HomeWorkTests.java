/*
package tests;

import lib.CoreTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWorkTests extends CoreTestCase
{
    @Test
    public void testHomeWork3_2() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'Search Wikipedia')]"), "Cannot find Search Wikipedia input", 5L);
        WebElement assertElementHasText = this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/search_src_text"), "Cannot find search input", 5L);
        String article_title = assertElementHasText.getAttribute("text");
        Assert.assertEquals("We see unexpected title", "Search…", article_title);
    }

    @Test
    public void testHomework3_3() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'Search Wikipedia')]"), "Cannot find Search Wikipedia", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "idea", "Cannot find search input", 5L);
        this.MainPageObject.waitForElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Mental image or concept']"), "Cannot find 'Mental image or concept' topic searching by 'idea'", 15L);
        this.MainPageObject.waitForElementAndClick(By.id("org.wikipedia:id/search_close_btn"), "Cannot find X to cancel search", 5L);
        this.MainPageObject.waitForElementAndClick(By.id("org.wikipedia:id/search_close_btn"), "Cannot find X to cancel search", 5L);
        this.MainPageObject.waitForElementNotPresent(By.id("org.wikipedia:id/search_close_btn"), "X is still present on the page", 15L);
    }

    @Test
    public void testHomework3_4() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'Search Wikipedia')]"), "Cannot find Search Wikipedia", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "president", "Cannot find search input", 5L);
        this.MainPageObject.waitForElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/fragment_search_results']//*[@text='President']"), "Cannot find 'President' topic searching by 'President'", 15L);
    }

    @Test
    public void testHome4_5() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Cannot find 'Search Wikipedia' input", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.xpath("//*[contains(@text,'Search…')]"), "Java", "Cannot find search input", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Programming language']"), "Cannot find Search Wikipedia input", 5L);
        this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Cannot find article title", 15L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//android.widget.ImageView[@content-desc='More options']"), "cannot find button to open article options", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@text='Add to reading list']"), "Cannot find option to add article to reading list", 5L);
        this.MainPageObject.waitForElementAndClick(By.id("org.wikipedia:id/onboarding_button"), "Cannot find 'Got it' tip overlay", 5L);
        this.MainPageObject.waitForElementAndClear(By.id("org.wikipedia:id/text_input"), "Cannot find input to set name of articles folder", 5L);
        String nameOfFolder = "Learning programming";
        this.MainPageObject.waitForElementAndSendKeys(By.id("org.wikipedia:id/text_input"), nameOfFolder, "Cannot put text into articles folder input", 5L);
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
    }

    @Test
    public void testhome4_6() {
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text, 'Search Wikipedia')]"), "Cannot find 'Search Wikipedia' input", 5L);
        this.MainPageObject.waitForElementAndSendKeys(By.xpath("//*[contains(@text,'Search…')]"), "Java", "Cannot find search input", 5L);
        this.MainPageObject.waitForElementAndClick(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']//*[@text='Programming language']"), "Cannot find Search Wikipedia input", 5L);
        this.MainPageObject.assertElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "We have not found title_text");
        this.MainPageObject.waitForElementPresent(By.id("org.wikipedia:id/view_page_title_text"), "Cannot find article title", 15L);
    }
}
*/
