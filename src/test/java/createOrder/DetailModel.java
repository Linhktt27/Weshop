package createOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailModel {
	WebDriver driver;
	By Color = By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div[3]/div/div[2]/select");
	By dllcolor = By.xpath("//div/div/select/option[@value=\"#2\"]");
	By ddlqty = By.xpath("//*[@id=\"quantity-variation\"]/div[2]/select/option[1]");
	By Qty = By.xpath("//*[@id=\"quantity-variation\"]/div[2]/select");
	By ddlqty2 = By.xpath("//*[@id=\"quantity-variation\"]/div[2]/select/option[2]");
	By ddlqty2Amz = By.xpath("//div/select[@name=\"buyQuantity\"]/option[2]");
	By btnbuynow = By.xpath("//div/button[@id=\"buyNow\"]");
	By btnAddToCart = By.xpath("//*[@id=\"addToCart\"]");
	By itemCartEbay = By.xpath("//*[@id=\"sub-cart\"]/div[1]/div/div/div/div/div[2]/div[1]/a");
	By itemCartAmz = By.xpath("//*[@id=\"sub-cart\"]/div[1]/div/div/div/div/div[2]/div[1]/a");
	By SeeCart = By.xpath("//*[@id=\"link_cart\"]");
	By waiticon = By.xpath("//*[@id=\"loading-amz\"]/div");
	public DetailModel(WebDriver driver)
	{
		this.driver = driver;
	}

}

