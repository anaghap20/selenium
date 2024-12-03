package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/restricted-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("kannama@gmail.com");
		driver.findElement(By.id("first_name")).sendKeys("first_name");
		driver.findElement(By.name("radio_1623120379")).click();
		driver.findElement(By.id("user_pass")).sendKeys("Atfghj5678w2");
		driver.findElement(By.id("last_name")).sendKeys("d");
		driver.findElement(By.id("number_box_1623120412")).sendKeys("20");
		driver.findElement(By.id("country_1629717450")).sendKeys("India");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
