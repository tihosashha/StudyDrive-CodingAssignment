package pages

import base.AbstractPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class MainSearchPage(webDriver: WebDriver) : AbstractPage(webDriver) {

    @FindBy(xpath = "//*[@id=\"search-form\"]/div/div/div[1]/input")
    lateinit var searchLine: WebElement

    @FindBy(id = "go-to-search-page-icon")
    lateinit var searchButton: WebElement


    fun inputSearchInformation(searchInformation: String) {
        searchLine.sendKeys(searchInformation)
    }

    fun clickOnTheSearchButton() {
        searchButton.click()
    }

    override val pageUrl = "https://www.studydrive.net/en/newsfeed"
}
