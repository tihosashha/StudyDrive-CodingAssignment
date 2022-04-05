package tests

import base.AbstractChromeWebDriverTest
import org.junit.Test
import pages.LogInPage
import pages.UserProfilePage
import scenario.ConsentScenario

class ChangingDataInAUserProfileTest : AbstractChromeWebDriverTest() {
    @Test
    fun `text search`() {
        val logInPage = LogInPage(driver)

        logInPage.openPage()
        // Acceptance of the privacy policy
        val consentScenario = ConsentScenario(driver)
        consentScenario.acceptAllCookies()
        // On the main page, click on the Login button
        logInPage.clickOnTheButtonLogIn()
        // Input email
        logInPage.inputEmail("kodibes290@xasems.com")
        // Input password
        logInPage.inputPassword("1Q2w3e4r5t")
        // Click on the button Log in
        logInPage.logIn()
        val userProfilePage = UserProfilePage(driver)
        // Open user profile
        userProfilePage.clickOnTheButtonProfile()
        // Click on the button settings
        userProfilePage.clickOnTheSettingsButton()
        // Click on the button "Edit profile"
        userProfilePage.clickOnTheButtonEditProfile()
        // Enter name
        userProfilePage.changeUserName("1111")
        // Click on the button "Save Changes"
        userProfilePage.clickOnSaveChangesButton()
        // Check that name was changed
        userProfilePage.assertThatSearchResultIsPresent()
    }
}