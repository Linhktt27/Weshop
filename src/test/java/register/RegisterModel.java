package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterModel {
	WebDriver driver;
    By IcnAvatar = By.xpath("//*[@id=\"header-top-app\"]/div[1]/div[2]/ul/li[4]/a/i");
    By TlkDangKy = By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div[3]/div[4]/a");
    By TxtTenDangNhap = By.xpath("//*[@id=\"reusername\"]/input");
    By TxtSoDienThoai = By.xpath("//*[@id=\"rephonenumber\"]/input");
    By TxtEmail = By.xpath("//*[@id=\"reemail\"]/input");
    By TxtMatKhau = By.xpath("//*[@id=\"repassword\"]/input");
    By TxtXacNhanMatKhau = By.xpath("//*[@id=\"rerepassword\"]/input");
    By BtnDangKy = By.xpath("//*[@id=\"register\"]/div/div/div[2]/form/div[3]/button");
    By errTenDangNhap = By.xpath("//*[@class=\"form-group has-error\"]");
    By errEmail = By.xpath("//div/*[@class=\"form-group has-error\"]");
    By notify = By.xpath("//*[@id=\"rerepassword\"]/div");
    
    public RegisterModel (WebDriver driver)
    {
    	this.driver = driver;
    }
}
