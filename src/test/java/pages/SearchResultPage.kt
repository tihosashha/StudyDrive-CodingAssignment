package pages

import base.AbstractPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import kotlin.test.assertTrue

class SearchResultPage(webDriver: WebDriver) : AbstractPage(webDriver) {

    @FindBy(linkText = "test.rtf")
    lateinit var searchResult: WebElement

    fun assertThatSearchResultIsPresent() {
        assertTrue { searchResult.isDisplayed }
    }

    override val pageUrl = "https://www.studydrive.net/en/search?phrase=test.rtf&university_id=6160&content=documents"
}