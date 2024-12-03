package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class package5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/column-1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_login")).sendKeys("anju");
        driver.findElement(By.id("user_email")).sendKeys("anju986@gmail.com");
        driver.findElement(By.id("user_pass")).sendKeys("#a&45%nju");
        driver.findElement(By.id("user_confirm_password")).sendKeys("#a&45%nju");
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-47\"]/form/div[2]/button")).click();
        
        

}}
