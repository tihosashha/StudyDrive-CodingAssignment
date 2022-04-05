package pages

import base.AbstractPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import kotlin.test.assertTrue

class UserProfilePage(webDriver: WebDriver) : AbstractPage(webDriver) {

    @FindBy(id = "profile-button")
    lateinit var profileButton: WebElement

    @FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div[1]/div/div/div/div/div[2]/div/div[2]/div[1]/div")
    lateinit var settingsButton: WebElement

    @FindBy(xpath = "//*[@id=\"main-container\"]/div[3]/div[1]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/a[1]/li/span")
    lateinit var editProfileButton: WebElement

    @FindBy(id = "username")
    lateinit var userNameField: WebElement

    @FindBy(xpath = "//*[@id=\"profile-edit-page\"]/div[6]/button[2]/span")
    lateinit var saveChangesButton: WebElement

    fun clickOnTheButtonProfile() {
        profileButton.click()
    }

    fun clickOnTheSettingsButton() {
        settingsButton.click()
    }

    fun clickOnTheButtonEditProfile() {
        editProfileButton.click()
    }

    fun changeUserName(userName: String) {
        userNameField.sendKeys(userName)
    }

    fun clickOnSaveChangesButton() {
        saveChangesButton.click()
    }

    fun assertThatSearchResultIsPresent() {
        assertTrue { userNameField.isDisplayed }
    }

    override val pageUrl = "https://www.studydrive.net/en/newsfeed"

}