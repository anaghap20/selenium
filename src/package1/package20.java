package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("ajishma");
		driver.findElement(By.id("last_name")).sendKeys("a");
		driver.findElement(By.id("user_login")).sendKeys("ajishmamol");
		driver.findElement(By.id("user_email")).sendKeys("ajishma234@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("ajiD567%");
		driver.findElement(By.id("user_confirm_password")).sendKeys("ajiD567%");
		driver.findElement(By.id("description")).sendKeys("hjhfuhueijcmksjmeckmcd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
