package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.wpeverest.com/user-registration/bordered/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys("kakkaaa");
	driver.findElement(By.id("user_email")).sendKeys("kakkaa123@gmail.com");
	driver.findElement(By.id("user_pass")).sendKeys("kakka@123");
	driver.findElement(By.id("user_confirm_password")).sendKeys("kakka@123");
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-43\"]/form/div[2]/button")).click();
	
    
}}
