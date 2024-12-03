package package1;

public class package8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("radio_1569481639")).click();
		driver.findElement(By.id("user_email")).sendKeys("manu123@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("m@%24nu");
		driver.findElement(By.id("country_1569483038")).sendKeys("Maldives");


	}

}
