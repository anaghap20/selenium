package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("anagha");
		driver.findElement(By.id("last_name")).sendKeys("p");
		driver.findElement(By.id("user_login")).sendKeys("futura1234");
		driver.findElement(By.id("user_email")).sendKeys("anaghapilathottam1@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("7306062742");
		driver.findElement(By.id("user_confirm_password")).sendKeys("7306062742");
		driver.findElement(By.id("description")).sendKeys("LIC");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();

	}

}
