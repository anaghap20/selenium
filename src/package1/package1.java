package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class package1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#item_0_title_link > div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("anagha");
		driver.findElement(By.id("last-name")).sendKeys("p");
		driver.findElement(By.id("postal-code")).sendKeys("673009");
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		driver.findElement(By.id("inventory_sidebar_link")).click();
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		element.sendKeys("Name(Z to A)");
		element.click();
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		element1.sendKeys("Price(high to low)");
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		element2.sendKeys("Name(A to Z)");
		element2.click();
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Price(low to high)");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
//		driver.close();
		
		

	}

}
