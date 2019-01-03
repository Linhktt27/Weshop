package createOrder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Login.LoginModel;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buynow {
	WebDriver driver;
	DetailModel detail = new DetailModel(driver);
	CheckoutModel checkout = new CheckoutModel (driver);
	LoginModel login = new LoginModel(driver);
	@Test
	@Given("^Truy cập website https://weshop\\.com\\.vn$")
	public void truy_cập_website_https_weshop_com_vn() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\phan mem\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://weshop.com.vn");
	}
	/*@When("^Truy cập vào trang chi tiết sản phẩm$")
	public void truy_cập_vào_trang_chi_tiết_sản_phẩm() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://weshop.com.vn/ebay/item/4-fork-tip-eyebrow-pencil-waterproof-eyebrow-tattoo-pen-lasting-makeup-acces-332731790890.html");
	}
	@When("^Chọn thuộc tính$")
	public void chọn_thuộc_tính() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement DDLcolor = wait.until(ExpectedConditions.visibilityOfElementLocated(detail.Color));
		DDLcolor.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement selectcolor = wait.until(ExpectedConditions.visibilityOfElementLocated(detail.dllcolor));
		selectcolor.click();
		Actions buider = new Actions(driver);
		buider.moveToElement(selectcolor).click().perform();
	}

	@When("^Chọn số lượng$")
	public void chọn_số_lượng() {
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(detail.ddlqty).click();
	}

	@When("^Chọn BuyNow$")
	public void chọn_BuyNow() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(detail.waiticon));
	driver.findElement(detail.btnbuynow).click();
	}

	@When("^Nhập Tên khách hàng$")
	public void nhập_Tên_kshách_hàng() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.txtName));
		UserName.sendKeys("Weshop Test");
	}

	@When("^Nhập số điện thoại$")
	public void nhập_số_điện_thoại() {
	 driver.findElement(checkout.txtPhone).sendKeys("0967984567");
	}

	@When("^Nhập email$")
	public void nhập_email() {
    driver.findElement(checkout.txtEmail).sendKeys("linhktt@peacesoft.net");
	}

	@When("^Nhập địa chỉ$")
	public void nhập_địa_chỉ() {
	driver.findElement(checkout.txtAddress).sendKeys("18 Tam Trinh");
	}

	@When("^Chọn Thành phố$")
	public void chọn_Thành_phố() {
	driver.findElement(checkout.txtCity).click();
	}

	@When("^Chọn Quận/huyện$")
	public void chọn_Quận_huyện() {
    driver.findElement(checkout.txtProvincy).click();
	}

	@When("^Chọn phương thức thanh toán$")
	public void chọn_phương_thức_thanh_toán() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement PaymentMethod = wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.OptPayment)); 
		PaymentMethod.click();
	}

	@When("^Chọn đồng ý điều khoản, điều kiện$")
	public void chọn_đồng_ý_điều_khoản_điều_kiện()  {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
		driver.findElement(checkout.OtpCondition).click();
	}

	@When("^Chọn button Checkout$")
	public void chọn_button_Checkout() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement payment = wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.OtpCondition)); 
		 js.executeScript("arguments[0].scrollIntoView();", payment);
		 Thread.sleep(2000);
		 driver.findElement(checkout.btnCheckout).click();
	}

	@Then("^Show popup thông báo mua hàng thành công$")
	public void show_popup_thông_báo_mua_hàng_thành_công() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.popupsuccess));
		Assert.assertTrue(popup.isDisplayed());
	}*/
	@When("^Truy cập vào trang chi tiết sản phẩm Ebay$")
	public void truy_cập_vào_trang_chi_tiết_sản_phẩm_Ebay() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://weshop.com.vn/ebay/item/12x-leads-2mm-lead-automatic-draughting-mechanical-drafting-pencil-holder-black-391756473208.html");
	}

	@When("^Chọn số lượng sản phẩm$")
	public void chọn_số_lượng_sản_phẩm() throws Throwable {
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(detail.Qty));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	   driver.findElement(detail.Qty).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(detail.ddlqty2)).click();;
	}

	@When("^Chọn Add to Cart sản phẩm Ebay$")
	public void chọn_Add_to_Cart_sản_phẩm_Ebay() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(detail.waiticon));
		 driver.findElement(detail.btnAddToCart).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(detail.itemCartEbay));
	}

	@When("^Truy cập vào trang chi tiết sản phẩm Amazon$")
	public void truy_cập_vào_trang_chi_tiết_sản_phẩm_Amazon() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://weshop.com.vn/amazon/item/bic-xtra-sparkle-mechanical-pencil--medium-point--0-7-mm---24-count-B0007L1VLO.html?seller=QW1hem9uLmNvbS1OZXctMy42NA==");
	}

	@When("^Chọn thuộc tính và số lượng$")
	public void chọn_thuộc_tính_và_số_lượng() throws Throwable {
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(detail.ddlqty2Amz)).click();
	 wait.until(ExpectedConditions.invisibilityOfElementLocated(detail.waiticon));
	}
	@When("^Chọn Add to Cart sản phẩm Amazon$")
	public void chọn_Add_to_Cart_sản_phẩm_Amazon() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 driver.findElement(detail.btnAddToCart).click();
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(detail.itemCartAmz)); 
	}
	
	@When("^Truy cập vào Cart và chọn Checkout$")
	public void truy_cập_vào_Cart_và_chọn_Checkout() throws Throwable {
	 driver.findElement(detail.SeeCart).click();
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.CheckoutCart));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	driver.findElement(checkout.CheckoutCart).click();
	}

	@When("^Chọn vào icon Avarta$")
	public void chọn_vào_icon_Avarta() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.txtName));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
		driver.findElement(login.IcnAvatar).click();
		
	}

	@When("^Nhập email và password chính xác$")
	public void nhập_email_và_password_chính_xác() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.TxtUsername)).sendKeys("heobeo12");
		driver.findElement(login.TxtPassword).sendKeys("12345678");
	}

	@When("^Chọn Login$")
	public void chọn_Login() throws Throwable {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.findElement(login.BtnLogin).click();
	}

	@When("^Chọn phương thức thanh toán qua Ví Ngân Lượng$")
	public void chọn_phương_thức_thanh_toán_qua_Ví_Ngân_Lượng() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.ImgAvatar));
		WebElement webElement = driver.findElement(checkout.txtProvincy);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", webElement);
		driver.findElement(checkout.OptNLWallet).click();
	}

	@When("^Chọn đồng ý điều khoản, điều kiện Weshop$")
	public void chọn_đồng_ý_điều_khoản_điều_kiện_Weshop() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
		driver.findElement(checkout.OtpCondition).click();
	}

	@When("^Chọn button Thanh toán đơn hàng$")
	public void chọn_button_Thanh_toán_đơn_hàng() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(checkout.btnCheckout);		
	}

	@Then("^Show popup thông báo mua hàng thành công và link sang cổng thanh toán$")
	public void show_popup_thông_báo_mua_hàng_thành_công_và_link_sang_cổng_thanh_toán() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.popupsuccess));
		Assert.assertTrue(popup.isDisplayed());
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.GateNL));
		String urlgate = driver.getCurrentUrl();
		Assert.assertTrue(urlgate.contains("https://sandbox.nganluong.vn:8088/nl35/checkout/version31/request/token_code/"));		
	}

	/*@When("^Truy cập vào màn hình bill request$")
	public void truy_cập_vào_màn_hình_bill_request() throws Throwable {
	   driver.get("http://weshop.com.vn/order-e7224716338b/bill.html");
	}

	@When("^Chọn button Thanh toán$")
	public void chọn_button_Thanh_toán() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.Checkoutrequest1)).click();
	}

	@When("^Chọn Phương thức Thanh toán qua Chuyển khoản ngân hàng$")
	public void chọn_Phương_thức_Thanh_toán_qua_Chuyển_khoản_ngân_hàng() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.OptBankTransfer)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
		driver.findElement(checkout.OtpCondition).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.BtnAgree)).click();
	}

	@When("^Chọn Thanh toán đơn hàng$")
	public void chọn_Thanh_toán_đơn_hàng() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(checkout.CheckoutRequest2).click();
	}

	@Then("^Link sang cổng thanh toán thành công$")
	public void link_sang_cổng_thanh_toán_thành_công() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.GateNL));
		String urlgate = driver.getCurrentUrl();
		Assert.assertTrue(urlgate.contains("https://sandbox.nganluong.vn:8088/nl35/checkout/version31/request/token_code/")); 
	}

	@When("^Truy cập vào màn hình bill addfee$")
	public void truy_cập_vào_màn_hình_bill_addfee() throws Throwable {
	  driver.get("https://weshop.com.vn/addfee-e7224716338bfee143769/bill.html");
	}

	@When("^Chọn Phương thức Thanh toán qua Visa$")
	public void chọn_Phương_thức_Thanh_toán_qua_Visa() throws Throwable {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.OptVisa)).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(checkout.waiticon));
	driver.findElement(checkout.OtpCondition).click();
	
	}

	@When("^Chọn Thanh toán đơn hàng addfee$")
	public void chọn_Thanh_toán_đơn_hàng_addfee() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.CheckoutRequest2)).click();
	}

	@Then("^Link sang cổng thanh toán Ngân Lượng thành công$")
	public void link_sang_cổng_thanh_toán_Ngân_Lượng_thành_công() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkout.GateNL));
		String urlgate = driver.getCurrentUrl();
		Assert.assertTrue(urlgate.contains("https://sandbox.nganluong.vn:8088/nl35/checkout/version31/request/token_code/")); 
	}
*/

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