package createOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutModel {
 WebDriver driver;
 By txtName = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[1]/div/input");
 By txtPhone = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[2]/div/div/input");
 By txtEmail = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[3]/div/input");
 By txtAddress = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[4]/div/input");
 By txtCity = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[5]/div[1]/select/option[3]");
 By txtProvincy = By.xpath("//*[@id=\"form-add\"]/div/div[1]/div[2]/div[5]/div[2]/select/option[5]");
 By OptPayment = By.xpath("/html/body/main/div/div/div[3]/div[1]/ul/li[3]/a/i");
 By OptNLWallet = By.xpath("/html/body/main/div/div/div[3]/div[1]/ul/li[3]/a");
 By OtpCondition = By.xpath("//*[@id=\"step2-agree\"]");
 By btnCheckout = By.xpath("//*[@id=\"btnSubmit\"]");
 By popupsuccess = By.xpath("//*[@id=\"paymentMessage\"]/div/div/div[2]");
 By waiticon = By.xpath("//*[@id=\"loading-amz\"]/div");
 By CheckoutCart = By.xpath("/html/body/div[11]/div/div[2]/div[2]/div[2]/div/div[2]");
 By GateNL = By.xpath("/html/body/div/div[3]");
 By Checkoutrequest1 = By.xpath("//*[@id=\"btnCheckoutBill\"]");
 By OptBankTransfer = By.xpath("//*[@id=\"otherCheckout\"]/div/div/div[2]/div/div[1]/div[1]/ul/li[2]/a/span");
 By BtnAgree = By.xpath("//*[@id=\"vn-btn-agree\"]");
 By CheckoutRequest2 = By.xpath("//*[@id=\"btnSubmit\"]");
 By OptVisa = By.xpath("//*[@id=\"otherCheckout\"]/div/div/div[2]/div/div[1]/div[1]/ul/li[1]/a/span");
 public CheckoutModel (WebDriver driver)
 {
	 this.driver = driver;
 }
}
