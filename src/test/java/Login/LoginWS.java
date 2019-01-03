package Login;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWS {
	WebDriver driver;
	LoginModel login = new LoginModel (this.driver);
	@Given("^Access website https://weshop\\.com\\.vn$")
	public void access_website_https_weshop_com_vn() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\phan mem\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://weshop.com.vn/");
	}

	@Given("^Click on button Login$")
	public void click_on_button_Login() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.IcnAvatar));
	    driver.findElement(login.IcnAvatar).click();
	}

	@When("^I don't fill data and click on button Login$")
	public void i_don_t_fill_data_and_click_on_button_Login() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.BtnLogin));
	    driver.findElement(login.BtnLogin).click();
	}

	@Then("^Show notify request fill information$")
	public void show_notify_request_fill_information() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.Error));
		 boolean status = driver.findElement(login.Error).isDisplayed();
		   Assert.assertTrue(status);
	}

	@When("^I fill username invalid is Weshopwww$")
	public void i_fill_username_invalid_is_Weshopwww() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.TxtUsername));
	   driver.findElement(login.TxtUsername).sendKeys("Weshopwww");
	}

	@When("^I fill password is (\\d+)$")
	public void i_fill_password_is(int arg1) throws Throwable {
	   driver.findElement(login.TxtPassword).sendKeys("123456");
	   driver.findElement(login.BtnLogin).click();
	}

	@Then("^Show notify inform username invalid$")
	public void show_notify_inform_username_invalid() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(login.ErrUsername));
		Assert.assertEquals("Username không chính xác!", notification.getText());
	}

	@When("^I fill username is heobeo(\\d+)$")
	public void i_fill_username_is_heobeo(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.TxtUsername));
	    driver.findElement(login.TxtUsername).sendKeys("heobeo12");
	}

	@When("^I fill password invalid is (\\d+)$")
	public void i_fill_password_invalid_is(int arg1) throws Throwable {
	    driver.findElement(login.TxtPassword).sendKeys("123456");
	    driver.findElement(login.BtnLogin).click();
	}

	@Then("^Show notify inform password invalid$")
	public void show_notify_inform_password_invalid() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(login.ErrPassword));
		Assert.assertEquals("Mật khẩu không chính xác!", notification.getText());
	}
	
	@When("^I fill username exactly is heobeo(\\d+)$")
	public void i_fill_username_exactly_is_heobeo(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.TxtUsername));
	   driver.findElement(login.TxtUsername).sendKeys("heobeo12");
	}
	@When("^I fill password exactly is (\\d+)$")
	public void i_fill_password_exactly_is(int arg1) throws Throwable {
	   driver.findElement(login.TxtPassword).sendKeys("12345678");
	   driver.findElement(login.BtnLogin).click();
	}
	@Then("^Show inform login success$")
	public void show_inform_login_success() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.ImgAvatar));
		 boolean status = driver.findElement(login.ImgAvatar).isDisplayed();
		   Assert.assertTrue(status);
	}
	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			System.out.println("Result: False");
			//#1. 
			// Take a screenshot and embeded into Html report
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
              }
		 driver.quit();

}
}
