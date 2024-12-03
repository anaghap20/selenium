package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class package13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/file-upload-form/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user_email")).sendKeys("adarshp123@gmail.com");
        
	}

}
