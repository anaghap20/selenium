package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrone.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/flat/");
		driver.findElement(By.id("user_login")).sendKeys("ramjirao");
		driver.findElement(By.id("user_email")).sendKeys("ramji23456@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("A456%@mju");
		driver.findElement(By.id("user_confirm_password")).sendKeys("A456%@mju");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-44\"]/form/div[2]/button")).click();

	}

}
