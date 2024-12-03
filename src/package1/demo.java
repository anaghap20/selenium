package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/payment-with-stripe-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("nayaniga49@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("N345%&ka");
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-351\"]/form/div[2]/button")).click();
		


	}

}
