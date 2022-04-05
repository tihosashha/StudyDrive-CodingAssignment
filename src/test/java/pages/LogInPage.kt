package pages

import base.AbstractPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class LogInPage(webDriver: WebDriver) : AbstractPage(webDriver) {

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div/div/nav/div/button[1]")
    lateinit var logInButton: WebElement

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div/input[1]")
    lateinit var emailField: WebElement

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div/input[2]")
    lateinit var passwordField: WebElement

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div/div/button[3]")
    lateinit var login: WebElement

    fun clickOnTheButtonLogIn() {
        logInButton.click()
    }

    fun inputEmail(email: String) {
        emailField.sendKeys(email)
    }

    fun inputPassword(password: String) {
        passwordField.sendKeys(password)
    }

    fun logIn() {
        login.click()
    }

    override val pageUrl = "https://www.studydrive.net/en/companies-search"
}