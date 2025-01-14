package Demo_Web_Shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Redister {
	WebDriver driver;
	@Test(groups = {"functionality","integration"})
	@Parameters("browser")
	public void Redister(String browsername) {
		//WebDriver driver = new ChromeDriver();
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Parwez");
		driver.findElement(By.name("LastName")).sendKeys("Mushraf");
		driver.findElement(By.name("Email")).sendKeys("parwez123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("12345678");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Reporter.log("Registered pass ",true);
		driver.quit();
	}
}
