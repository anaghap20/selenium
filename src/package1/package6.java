package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("prayagpullor@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("prayagp");
		driver.findElement(By.id("first_name")).sendKeys("prayag");
		driver.findElement(By.id("last_name")).sendKeys("p");
		driver.findElement(By.id("user_pass")).sendKeys("p%@r14ayag");
		driver.findElement(By.id("user_confirm_password")).sendKeys("p%@r14ayag");
		driver.findElement(By.id("nickname")).sendKeys("paagu");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Flower");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();

	}

}
