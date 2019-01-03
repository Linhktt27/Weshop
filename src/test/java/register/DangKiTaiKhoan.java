package register;

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

public class DangKiTaiKhoan {
	WebDriver driver;
	RegisterModel register = new RegisterModel(driver);
	@Given("^Access website https://weshop\\.com\\.vn$")
	public void access_website_https_weshop_com_vn() {
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.IcnAvatar));
	    driver.findElement(register.IcnAvatar).click();
	}

	@Given("^Click on textlink Register$")
	public void click_on_textlink_Register() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TlkDangKy));
		driver.findElement(register.TlkDangKy).click();
	}

	@When("^I don't fill data and click on button Register$")
	public void i_don_t_fill_data_and_click_on_button_Register() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.BtnDangKy));
		driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify request fill information$")
	public void show_notify_request_fill_information() throws Throwable {
		 boolean status = driver.findElement(register.errTenDangNhap).isDisplayed();
		   Assert.assertTrue(status);
	}

	@When("^I fill all field is space$")
	public void i_fill_all_field_is_space() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtTenDangNhap).sendKeys("        ");
		 driver.findElement(register.TxtSoDienThoai).sendKeys("        ");
		 driver.findElement(register.TxtEmail).sendKeys("          ");
		 driver.findElement(register.TxtMatKhau).sendKeys("        ");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("        ");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify request fill infor valid$")
	public void show_notify_request_fill_infor_valid() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(register.errEmail));
	    boolean error = driver.findElement(register.errEmail).isDisplayed();
		   Assert.assertTrue(error);
	}

	@When("^I fill username is \"([^\"]*)\"$")
	public void i_fill_username_is(String username) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtTenDangNhap).sendKeys(username);
	}

	@When("^Fill phone number, email, password, confirm password exactly$")
	public void fill_phone_number_email_password_confirm_password_exactly() throws Throwable {
		driver.findElement(register.TxtSoDienThoai).sendKeys("0967982768");
		 driver.findElement(register.TxtEmail).sendKeys("weshoptest65843543@gmail.com");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error \"([^\"]*)\" username$")
	public void show_notify_error_username(String error) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals(error, notification.getText());
	}

	@When("^I fill username had in system$")
	public void i_fill_username_had_in_system() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtTenDangNhap).sendKeys("Linhktt1");
	}

	@When("^Fill phone, email, password, confirm password exactly$")
	public void fill_phone_email_password_confirm_password_exactly() throws Throwable {
		 driver.findElement(register.TxtSoDienThoai).sendKeys("0967982768");
		 driver.findElement(register.TxtEmail).sendKeys("weshoptest65843543@gmail.com");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error username invalid$")
	public void show_notify_error_username_invalid() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals("Username này đã được sử dụng, vui lòng dùng username khác.", notification.getText());
	}

	@When("^I fill phone \"([^\"]*)\" invaliad$")
	public void i_fill_phone_invaliad(String phone) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtSoDienThoai).sendKeys(phone);
	}

	@When("^Fill username, email, password, repet password exactly$")
	public void fill_username_email_password_repet_password_exactly() throws Throwable {
		 driver.findElement(register.TxtTenDangNhap).sendKeys("WeshopTest385435459");
		 driver.findElement(register.TxtEmail).sendKeys("weshoptest65843543@gmail.com");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error \"([^\"]*)\" phone number$")
	public void show_notify_error_phone_number(String error) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals(error, notification.getText());
	}

	@When("^I fill phone had in system$")
	public void i_fill_phone_had_in_system() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtSoDienThoai).sendKeys("0967982794");
	}

	@When("^Fill username, email, password, confirm password exactly$")
	public void fill_username_email_password_confirm_password_exactly() throws Throwable {
		 driver.findElement(register.TxtTenDangNhap).sendKeys("WeshopTest385435459");
		 driver.findElement(register.TxtEmail).sendKeys("weshoptest65843543@gmail.com");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error phone number$")
	public void show_notify_error_phone_number() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals("Số điện thoại này đã được sử dụng, vui lòng dùng số điện thoại khác", notification.getText());
	}

	@When("^I fill email invaliad$")
	public void i_fill_email_invaliad() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
		driver.findElement(register.TxtEmail).sendKeys("linktt@");
	}

	@When("^Fill username, phone number, password, confirm password exactly$")
	public void fill_username_phone_number_password_confirm_password_exactly() throws Throwable {
		 driver.findElement(register.TxtTenDangNhap).sendKeys("WeshopTest385435459");
		 driver.findElement(register.TxtSoDienThoai).sendKeys("0967854233");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error email invalid$")
	public void show_notify_error_email_invalid() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals("Email không đúng định dạng", notification.getText());
	}

	@When("^I fill email had in system$")
	public void i_fill_email_had_in_system() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
	    driver.findElement(register.TxtEmail).sendKeys("linhktt@peacesoft.net");
	}

	@When("^Fill username, phone, password, confirm password exactly$")
	public void fill_username_phone_password_confirm_password_exactly() throws Throwable {
		driver.findElement(register.TxtTenDangNhap).sendKeys("WeshopTest385435459");
		 driver.findElement(register.TxtSoDienThoai).sendKeys("0967854233");
		 driver.findElement(register.TxtMatKhau).sendKeys("123456");
		 driver.findElement(register.TxtXacNhanMatKhau).sendKeys("123456");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error email$")
	public void show_notify_error_email() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(register.notify));
		Assert.assertEquals("Email này đã được sử dụng, vui lòng dùng email khác", notification.getText());
	}

	@When("^I fill password$")
	public void i_fill_password() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(register.TxtTenDangNhap));
	   driver.findElement(register.TxtMatKhau).sendKeys("123456");
	}

	@When("^I fill password confirm do not like password$")
	public void i_fill_password_confirm_do_not_like_password() throws Throwable {
	  driver.findElement(register.TxtXacNhanMatKhau).sendKeys("654321");
	}

	@When("^Fill username, phone number, email exactly$")
	public void fill_username_phone_number_email_exactly() throws Throwable {
		driver.findElement(register.TxtTenDangNhap).sendKeys("WeshopTest385435459");
		 driver.findElement(register.TxtSoDienThoai).sendKeys("0967854233");
		 driver.findElement(register.TxtEmail).sendKeys("weshoptest347593584@gmail.com");
		 driver.findElement(register.BtnDangKy).click();
	}

	@Then("^Show notify error password do not match$")
	public void show_notify_error_password_do_not_match() throws Throwable {
		 boolean status = driver.findElement(register.errTenDangNhap).isDisplayed();
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
