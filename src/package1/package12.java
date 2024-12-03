package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class package12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/donation-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("devan456@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("D23$45%89");
		WebElement element=driver.findElement(By.cssSelector("#user-registration-form-311 > form > div.ur-form-row > div > div.ur-field-item.field-range > div > div.ur-range-number > input"));
		element.clear();
		element.sendKeys("54");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-311\"]/form/div[2]/button")).click();
       
	}

}
