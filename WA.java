package dem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WA {
	 public static WebDriver driver ; 
	 
	 

	  @BeforeClass
	  public void beforeClass() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/chromedriver");
			 driver = new ChromeDriver();  
			 driver.manage().window().maximize();
			 driver.get("https://maxincomesystem.com/registration");
				//Thread.sleep(8000);
	  }

	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException
	  {
			Thread.sleep(1000);
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
			Thread.sleep(1000);
	  }

	  @Test
	  public void f()
	  {
		 System.out.println("Hi test"); 
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[1]/input")).sendKeys("Ziaqa10");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[2]/input")).sendKeys("Nadsoft");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[3]/input")).sendKeys("ziaqa10@gmail.com");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[4]/input")).sendKeys("7020903936");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[5]/input")).sendKeys("Pune");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[6]/input")).sendKeys("Pune");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[7]/input")).sendKeys("Pune");
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[7]/input")).sendKeys("MH");
		// driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[8]/label/select")).click();
		 Select drpCountry = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[8]/label/select")));
		 drpCountry.selectByVisibleText("India");
		 //driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[2]/div/div/div[9]/a")).click();
		 
		 
	  }
}
