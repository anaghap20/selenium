package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/date-and-time-form/");
        driver.manage().window().maximize();
        driver.findElement(By.id("first_name")).sendKeys("reeja");
        driver.findElement(By.id("last_name")).sendKeys("e");
        driver.findElement(By.id("user_email")).sendKeys("reeja123@gmail.com");
        driver.findElement(By.id("user_pass")).sendKeys("Reeja$@234");
        driver.findElement(By.xpath("//*[@id=\"radio_1623131945_no\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"timepicker_1641276686\"]")).click();
        driver.findElement(By.xpath("/html/body/div[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"timepicker_1641276686\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-336\"]/form/div[6]/button")).click();
        
        
	}

}
