package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearhModel {
	WebDriver driver;
	By icnTuMy = By.xpath("//*[@id=\"qunit-userAgent-header-US\"]/a");
	By parentaliasEbay = By.xpath("//*[@id=\"alias-ebay\"]/ul/li[1]/a");
	By logoAmz = By.xpath("//*[@id=\"title-alias-amazon\"]/a/i");
	By gateAmz = By.xpath("//*[@id=\"title-alias-amazon\"]/a");
	By ParentAliasAmz = By.xpath("//*[@id=\"alias-amazon\"]/ul/li[2]/a");
	By txtSearch = By.xpath("//*[@id=\"search\"]");
	By icnSearch = By.xpath("//*[@id=\"searchButton\"]/i");
	By noResult = By.xpath("//*[@id=\"ebay-search-result-products\"]/form/div");
	By Result = By.xpath("//*[@id=\"ebay-search-result-products\"]/div/div[2]");
	By ResultCate = By.xpath("//*[@id=\"search-result-products\"]/div/div[2]");
	By Listproduct = By.xpath("//div/div[@class=\"content\"]/ul/li");
	By btnbuynow = By.xpath("//div/button[@id=\"buyNow\"]");
	By txtcateEbay = By.xpath("//*[@id=\"alias-ebay\"]/ul/li[1]/div/div/div[1]/div[2]/div[1]/div/ul/li[2]/a");
	By txtCategoryAmz = By.xpath("//*[@id=\"alias-amazon\"]/ul/li[2]/div/div/div[3]/div/div[1]/ol/li[1]/a");
	By txtSeller = By.xpath("//div/a[1][@href=\"/ebay/seller/pens_n_more.html\"]");
	By FormSeller = By.xpath("//*[@id=\"search-result-left\"]/div[1]");
	By Sort = By.xpath("//*[@id=\"ebay-search-result-products\"]/div/div[1]/div[3]/div/button");
	By SortLowToHigh = By.xpath("//*[@id=\"ebay-search-result-products\"]/div/div[1]/div[3]/div/ul/li[2]/a/b");
	By SortPrice = By.xpath("//*[@id=\"ebay-search-result-left\"]/div[3]/ul/li[2]/div/label");
	By SortConditon = By.xpath("//*[@id=\"ebay-search-result-left\"]/div[4]/ul/li[4]/div/label");
	By SortCategory = By.xpath("//*[@id=\"ebay-search-result-left\"]/div[1]/ul/li[2]/div/a");
	By SellerCategory = By.xpath("//*[@id=\"search-result-left\"]/div[3]/ul/li[1]/div/a");
	public SearhModel (WebDriver driver) {
		this.driver = driver;
	}

}
