package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class package9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/label")).click();
		driver.findElement( By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
		driver.findElement(By.name("phone_1569482700")).sendKeys("(730)606-2742");
		driver.findElement(By.id("user_url")).sendKeys("https://en.wikipedia.org/wiki/Lion");
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
		driver.findElement(By.id("user_email")).sendKeys("raju456@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("M!@%24nurt");
		driver.findElement(By.id("country_1569483038")).sendKeys("Maldives");
		driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_field\"]/ul/li/label")).click();
		driver.findElement(By.id("textarea_1569483045")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
		
		


	}

}
