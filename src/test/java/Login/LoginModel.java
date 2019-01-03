package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModel {
WebDriver driver;
public By IcnAvatar = By.xpath("//*[@id=\"header-top-app\"]/div[1]/div[2]/ul/li[4]/a");
public By ImgAvatar = By.xpath("//*[@id=\"header-top-app\"]/div[1]/div[2]/ul/li[4]/a/span");
public By TxtUsername = By.xpath("//*[@id=\"username\"]");
public By TxtPassword = By.xpath("//*[@id=\"password\"]");
public By ErrUsername = By.xpath("//*[@id=\"login_username_error\"]");
public By ErrPassword = By.xpath("//*[@id=\"login_password_error\"]");
public By Error = By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[3]/div[1]");
public By BtnLogin = By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[3]/button");

public LoginModel (WebDriver driver) {
	this.driver = driver;
}
}
