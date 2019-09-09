package MavenDemo.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 
public class LoginTest {
	
	//public static WebDriver driver;
	
	@Test
	public void setup() {
	 
		//System.setProperty("webdriver.chrome.driver", "D:\\java class_Sdet\\Selenium Required JARs\\Drivers\\chromedriver.exe");
		String  driverPath=System.getProperty("user.dir")+"\\src\\test\\java\\Browser\\chromedriver.exe";
		//System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Maximize browser
		driver.manage().window().maximize();
		//driver.findElement(By.id("userNavigationLabel")).click();
		
	}
}
