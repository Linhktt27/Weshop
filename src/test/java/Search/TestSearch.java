package Search;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSearch {
	WebDriver driver;
	SearhModel search = new SearhModel (this.driver);
	@Given("^Truy cập website https://weshop\\.com\\.vn$")
	public void truy_cập_website_https_weshop_com_vn() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\phan mem\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://weshop.com.vn/");
	}

	@When("^Chọn vào textbox Search và nhập keyword là wswswswswsw(\\d+)$")
	public void chọn_vào_textbox_Search_và_nhập_keyword_là_wswswswswsw(int arg1) throws Throwable {
	   WebDriverWait wait = new WebDriverWait (driver,10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
	   driver.findElement(search.txtSearch).sendKeys("wswswswswsw",Keys.ENTER);
	   
	}

	@Then("^Hiển thị thông báo không có kết quả tìm kiếm$")
	public void hiển_thị_thông_báo_không_có_kết_quả_tìm_kiếm() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.noResult)); 
		boolean notfound = driver.findElement(search.noResult).isDisplayed();
		   Assert.assertTrue(notfound);	
	}

	@When("^Chọn vào textbox Search và nhập keyword là laptop$")
	public void chọn_vào_textbox_Search_và_nhập_keyword_là_laptop() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("laptop");
		   driver.findElement(search.icnSearch).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác cho Ebay và Amazon$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_cho_Ebay_và_Amazon() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.Result)); 
    	for (WebElement element: driver.findElements(search.Listproduct)) {
    		System.out.println("==================");
    		String actualString = element.findElement(By.xpath("div/div[@class=\"info\"]/div[@class=\"name\"]/a")).getText();
    		String lowercase = actualString.toLowerCase();
    		System.out.println(lowercase);
    		Assert.assertTrue(lowercase.contains("laptop"));
    //Nếu tên sản phẩm không có trong keyword thì chụp ảnh cho vào report
    	}
    }
	@When("^Chọn vào textbox Search và nhập keyword là (\\d+)$")
	public void chọn_vào_textbox_Search_và_nhập_keyword_là(int arg1) throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("232604761670");
		   driver.findElement(search.icnSearch).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo sku$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_sku() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.Result)); 
		for (WebElement element: driver.findElements(search.Listproduct)) {
    		System.out.println("==================");
    		String actualString = element.findElement(By.xpath("div/div[@class=\"info\"]/div[@class=\"name\"]/a")).getText();
    		String lowercase = actualString.toLowerCase();
    		System.out.println(lowercase);
    		Assert.assertTrue(lowercase.contains("prismacolor colors scholar colored pencil set, assorted colors, 36-count, 2 sets"));
	}
	}

	@When("^Chọn vào textbox Search và nhập keyword là https://www\\.ebay\\.com/itm/(\\d+)$")
	public void chọn_vào_textbox_Search_và_nhập_keyword_là_https_www_ebay_com_itm(int arg1) throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("https://www.ebay.com/itm/232604761670");
		   driver.findElement(search.icnSearch).click();
	}

	@Then("^Truy cập vào trang detail sản phẩm tìm được$")
	public void truy_cập_vào_trang_detail_sản_phẩm_tìm_được() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.btnbuynow)); 
		  String url = driver.getCurrentUrl();
		  Assert.assertEquals("https://weshop.com.vn/ebay/item/prismacolor-colors-scholar-colored-pencil-set--assorted-colors--36-count--2-sets-232604761670.html", url);
		  System.out.println(url);
	}

	@When("^Chọn vào (\\d+) danh mục Ebay trên trang Home$")
	public void chọn_vào_danh_mục_Ebay_trên_trang_Home(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		 Actions mouse = new Actions(driver);
		  WebElement FromUS = wait.until(ExpectedConditions.visibilityOfElementLocated(search.icnTuMy));
		  mouse.moveToElement(FromUS).build().perform(); 
	      WebElement ParentAls = wait.until(ExpectedConditions.visibilityOfElementLocated(search.parentaliasEbay));
	      Actions moveoverparent = new Actions(driver);
	      moveoverparent.moveToElement(ParentAls).build().perform();
	      WebElement Als = wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtcateEbay));
	      Als.click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo danh mục Ebay$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_danh_mục_Ebay() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(search.ResultCate)); 
			for (WebElement element: driver.findElements(search.Listproduct)) {
	    		System.out.println("==================");
	    		String actualString = element.findElement(By.xpath("div/div[@class=\"info\"]/div[@class=\"name\"]/a")).getText();
	    		String lowercase = actualString.toLowerCase();
	    		System.out.println(lowercase);
	    		Assert.assertTrue(lowercase.contains("jean"));
		}
	}

	@When("^Chọn vào (\\d+) danh mục Amazon trên trang Home$")
	public void chọn_vào_danh_mục_Amazon_trên_trang_Home(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		 Actions mouse = new Actions(driver);
		  WebElement FromUS = wait.until(ExpectedConditions.visibilityOfElementLocated(search.icnTuMy));
		  mouse.moveToElement(FromUS).build().perform(); 
		  WebElement gateAmz = wait.until(ExpectedConditions.visibilityOfElementLocated(search.gateAmz));
	      Actions moveovergate = new Actions(driver);
	      moveovergate.moveToElement(gateAmz).build().perform();
	      WebElement ParentAlsAmz = wait.until(ExpectedConditions.visibilityOfElementLocated(search.ParentAliasAmz));
	      Actions moveoverparent = new Actions(driver);
	      moveoverparent.moveToElement(ParentAlsAmz).build().perform();
	      WebElement AlsAmz = wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtCategoryAmz));
	      AlsAmz.click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo danh mục Amazon$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_danh_mục_Amazon() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(search.ResultCate)); 
			for (WebElement element: driver.findElements(search.Listproduct)) {
	    		System.out.println("==================");
	    		String actualString = element.findElement(By.xpath("div/div[@class=\"info\"]/div[@class=\"name\"]/a")).getText();
	    		String lowercase = actualString.toLowerCase();
	    		System.out.println(lowercase);
	    		Assert.assertTrue(lowercase.contains("watch"));
		}
	}

	@When("^Truy cập vào (\\d+) trang chi tiết sản phẩm ebay$")
	public void truy_cập_vào_trang_chi_tiết_sản_phẩm_ebay(int arg1) throws Throwable {
	    driver.get("https://weshop.com.vn/ebay/item/prismacolor-colors-scholar-colored-pencil-set--assorted-colors--36-count-232601627213.html");
	}

	@When("^Chọn vào seller$")
	public void chọn_vào_seller() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSeller)); 
	    driver.findElement(search.txtSeller).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo seller$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_seller() throws Throwable {
		 WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.FormSeller)); 
		Assert.assertTrue(driver.findElement(search.FormSeller).isDisplayed() && driver.findElement(search.ResultCate).isDisplayed());
	}

	@When("^Chọn vào textbox search và nhập keyword là tablet$")
	public void chọn_vào_textbox_search_và_nhập_keyword_là_tablet() throws Throwable {
		  WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("tablet");
		   driver.findElement(search.icnSearch).click();
	}

	@When("^Chọn sắp xếp theo giá từ thấp đến cao$")
	public void chọn_sắp_xếp_theo_giá_từ_thấp_đến_cao() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search.Sort));
		driver.findElement(search.Sort).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.SortLowToHigh)); 
	   driver.findElement(search.SortLowToHigh).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo giá từ thấp đến cao$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_giá_từ_thấp_đến_cao() throws Throwable {
		Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
		String url = driver.getCurrentUrl();
	    Assert.assertEquals("https://weshop.com.vn/search/tablet.html?portal=ebay&sort=PricePlusShippingLowest", url);
		System.out.println(url);
		
	}

	@When("^Chọn vào textbox search và nhập keyword là clothes$")
	public void chọn_vào_textbox_search_và_nhập_keyword_là_clothes() throws Throwable {
		  WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("clothes");
		   driver.findElement(search.icnSearch).click();
	}

	@When("^Chọn tìm kiếm theo khoảng giá (\\d+)\\.(\\d+) - (\\d+)\\.(\\d+)\\.(\\d+) VNĐ$")
	public void chọn_tìm_kiếm_theo_khoảng_giá_VNĐ(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.SortPrice)); 
	     driver.findElement(search.SortPrice).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo giá nằm trong khoảng (\\d+)\\.(\\d+) - (\\d+)\\.(\\d+)\\.(\\d+) VNĐ$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_giá_nằm_trong_khoảng_VNĐ(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		 Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
	}

	@When("^Chọn vào textbox search và nhập keyword là speaker bluetooth$")
	public void chọn_vào_textbox_search_và_nhập_keyword_là_speaker_bluetooth() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("speaker bluetooth");
		   driver.findElement(search.icnSearch).click();
	}

	@When("^Chọn tìm kiếm theo hàng có tình trạng Used$")
	public void chọn_tìm_kiếm_theo_hàng_có_tình_trạng_Used() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.SortConditon)); 
	    driver.findElement(search.SortConditon).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác các sản phẩm Used$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_các_sản_phẩm_Used() throws Throwable {
		 Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
	}

	@When("^Chọn vào textbox search và nhập keyword là speaker$")
	public void chọn_vào_textbox_search_và_nhập_keyword_là_speaker() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
		   driver.findElement(search.txtSearch).sendKeys("speaker");
		   driver.findElement(search.icnSearch).click();
	}

	@When("^Chọn (\\d+) danh mục nằm trong keyword$")
	public void chọn_danh_mục_nằm_trong_keyword(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.SortCategory)); 
		 driver.findElement(search.SortCategory).click();
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo cả keyword và danh mục$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_cả_keyword_và_danh_mục() throws Throwable {
		 Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
	}

	@When("^Truy cập vào (\\d+) link seller$")
	public void truy_cập_vào_link_seller(int arg1) throws Throwable {
	   driver.get("https://weshop.com.vn/ebay/seller/electronicpro01.html");
	}

	@When("^Nhập keyword và chọn search$")
	public void nhập_keyword_và_chọn_search() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.txtSearch)); 
	    driver.findElement(search.txtSearch).sendKeys("Bluetooth");
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo cả seller và keyword$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_cả_seller_và_keyword() throws Throwable {
		Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
	}

	@When("^Truy cập vào trang seller$")
	public void truy_cập_vào_trang_seller() throws Throwable {
		 driver.get("https://weshop.com.vn/ebay/seller/electronicpro01.html");
	}

	@When("^Chọn danh mục và Search$")
	public void chọn_danh_mục_và_Search() throws Throwable {
		WebDriverWait wait = new WebDriverWait (driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(search.SellerCategory)).click();; 
	}

	@Then("^Hiển thị kết quả tìm kiếm chính xác theo cả seller và danh mục$")
	public void hiển_thị_kết_quả_tìm_kiếm_chính_xác_theo_cả_seller_và_danh_mục() throws Throwable {
		Assert.assertTrue(driver.findElement(search.Listproduct).isDisplayed());
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
