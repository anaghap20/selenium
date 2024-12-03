package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class package7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-3/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("ammu456@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("ammu567");
		driver.findElement(By.id("user_pass")).sendKeys("ammu@123");
		driver.findElement(By.id("first_name")).sendKeys("ammu");
		driver.findElement(By.id("last_name")).sendKeys("a");
		driver.findElement(By.id("nickname")).sendKeys("maalu");
		driver.findElement(By.id("user_url")).sendKeys("https://www.britannica.com/topic/love-emotion");
		driver.findElement(By.id("textarea_1530101155")).sendKeys("be alert");
		driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
		driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.arrowLeft.open.arrowBottom > div.flatpickr-months > div > div > div > input")).sendKeys("0002024");
		WebElement testDropDown=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
		Select dropdown=new Select(testDropDown);
		dropdown.selectByVisibleText("March");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[26]")).click();
	    driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[4]/button")).click();

	}

}
