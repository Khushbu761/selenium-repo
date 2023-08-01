package in.gov.bsf.projrcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeTestLoginpage {

	
		@Test
		public void loginTest() throws InterruptedException {
			System.out.println("Start loginTest");
			// Create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// open test Page
			String url = "http://cgpsc.demodevelopment.com/auth/login";
			driver.get(url);
			System.out.println("Page is open");
			
			WebElement EmailId = driver.findElement(By.id("loginform-username"));
			EmailId.sendKeys("skhushbu761@gmail.com");
			// enter Password
			WebElement Password = driver.findElement(By.id("loginform-password"));
			Password.sendKeys("Password123");
			
			driver.findElement(By.xpath("//*[@id=\"admin-login-form\"]/button")).click();
			Thread.sleep(2000);
			
			WebElement Password1 = driver.findElement(By.id("loginform-password"));
			driver.findElement(By.id("loginform-password")).clear();
			Password1.sendKeys("Password123@");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"admin-login-form\"]/button")).click();

	}

}
