package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/recaptcha-registration-form/");
		driver.findElement(By.id("first_name")).sendKeys("somu");
		driver.findElement(By.id("user_email")).sendKeys("somu@gmail.com");
		driver.findElement(By.id("display_name")).sendKeys("somukuttan");
		driver.findElement(By.id("last_name")).sendKeys("m");
		driver.findElement(By.id("user_pass")).sendKeys("Sommu%7!34");
		driver.findElement(By.name("phone_1623134125")).sendKeys("(976) 845-6098");
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		

	}

}
