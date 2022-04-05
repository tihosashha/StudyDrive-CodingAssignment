package tests

import base.AbstractChromeWebDriverTest
import org.junit.Test
import pages.LogInPage
import pages.MainSearchPage
import pages.SearchResultPage
import scenario.ConsentScenario

class SearchOnTheMainPageTest : AbstractChromeWebDriverTest() {

    @Test
    fun `text search`() {
        val logInPage = LogInPage(driver)

        logInPage.openPage()
        // Acceptance of the privacy policy
        val consentScenario = ConsentScenario(driver)
        consentScenario.acceptAllCookies()
        // On the main page, click on the Log in button
        logInPage.clickOnTheButtonLogIn()
        // Input email
        logInPage.inputEmail("kodibes290@xasems.com")
        // Input password
        logInPage.inputPassword("1Q2w3e4r5t")
        // Click on the button Log in
        logInPage.logIn()
        // Document search by title
        val mainSearchPage = MainSearchPage(driver)
        mainSearchPage.inputSearchInformation("test.rtf")
        mainSearchPage.clickOnTheSearchButton()
        // Checking that the search results match the search parameters
        val searchResultPage = SearchResultPage(driver)
        searchResultPage.assertThatSearchResultIsPresent()
    }
}