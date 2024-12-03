package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pac17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/profile-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("abdcf");
		driver.findElement(By.id("last_name")).sendKeys("d");
		driver.findElement(By.id("display_name")).sendKeys("abdcf");
		driver.findElement(By.id("user_email")).sendKeys("abdcf23@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("abdc.f");
		driver.findElement(By.id("user_pass")).sendKeys("A%@789hnjmk");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-329\"]/form/div[3]/button")).click();

	}

}
