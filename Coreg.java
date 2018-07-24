package dem;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Coreg {
	public static WebDriver driver ; 

	  @BeforeClass
	  	public void beforeClass()
		  {
			  System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/chromedriver");
				 driver = new ChromeDriver();  
				 driver.manage().window().maximize();
				 driver.get("https://offers.tradingtips.com/coreg/login.php");
		  }

		
	  @BeforeMethod
	  	public void beforeMethod() throws InterruptedException 
	  {
		Thread.sleep(2000);  
	  }

	  @AfterMethod
	  	public void afterMethod() throws InterruptedException
	  {
			Thread.sleep(2000);
	  }

	  @Test
	  public void execute() throws InterruptedException, AWTException
	  {
		  login();
		  publisher();
//		  advertiser();
//		  manage_offer(); 
//		  manage_offer_pages();
	  }
	  
	  public void login() throws InterruptedException 
	  {
		  System.out.println("Hi test"); 
		  driver.findElement(By.xpath("//*[@id=\"coreg-email\"]")).sendKeys("manoj@nadsoftdev.com");
		  driver.findElement(By.xpath("//*[@id=\"user-password\"]")).sendKeys("nadsoft123");
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[3]/div/button")).click(); 
		  Thread.sleep(5000);
	  }
	  
	  public void publisher() throws InterruptedException 
	  {
		  //click on publisher
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/a/span[1]")).click();
		  Thread.sleep(2500);
		  //select add new
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/ul/li[2]/a")).click();
		  System.out.println("Addnew publisher");
		  System.out.println("Verifying page title : publisher");

		  // Verifying page title
		  String pub_act = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/h1")).getText();
		  String pub_exp = ("Add New Publisher");
		  Assert.assertEquals(pub_act, pub_exp);
		  
		  System.out.println("Verified page title");
		  // Adding pub info
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[1]/input")).sendKeys("puba10May01");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[2]/input")).sendKeys("Nadsoft");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[3]/input")).sendKeys("nadsoftsdfsdfsfdsffsdfsf@outlook.com");
		  driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("nadsoft123");	  
		  driver.findElement(By.xpath("//*[@id=\"cpwd\"]")).sendKeys("nadsoft123");	
		  //cost per lead
		  driver.findElement(By.xpath("//*[@id=\"publisher_lead_amount\"]")).sendKeys("10");
		  driver.findElement(By.xpath("//*[@id=\"publisher_pageview_amount\"]")).sendKeys("10");
		  Thread.sleep(5000);
		  //create pub
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[10]/div[1]/button")).click();
		  //verify on pub page
		  Thread.sleep(5000);
		  String pub_email1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div")).getText();
		  String pub_email2 = ("New Publisher Successfully Added");
		  Assert.assertEquals(pub_email1, pub_email2);
		  System.out.println("Actual message : "+pub_email1);
		  System.out.println("Expected message : "+pub_email2);
		  System.out.println("Verified sucessfully");
		  
	  }
	  
	  public void advertiser() throws InterruptedException
	  {
		//click on advertiser
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a")).click();
		  Thread.sleep(1500);
		  //select add new
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/ul/li[2]/a")).click();
		  System.out.println("Addnew ADvertiser");
		  System.out.println("Verifying page title : ADvertiser ");
		  
		// Verifying page title
		  String adv_act = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		  String adv_exp = ("Add New Advertiser");
		  Assert.assertEquals(adv_act, adv_exp);
		  System.out.println("Actual page title : "+ adv_act);
		
		//Change advertiser name   
		// Adding advertiser info
		  driver.findElement(By.xpath("//*[@id=\"offertitle\"]")).sendKeys("advauto10may02");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/input")).sendKeys("Nadsoft");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[3]/input")).sendKeys("test address");
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[4]/input")).sendKeys("nadsoftsdfsdfsfsf@outlook.com");
		  //create advertiser
		  Thread.sleep(1000);
		  //driver.findElement(By.name("submit")).submit();
		  Thread.sleep(1000);
		  System.out.println("adv_act created");
	  
	  }
	  public void manage_offer() throws InterruptedException, AWTException
	  {
		  //click on manage_offer
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[5]/a/span[1]")).click();
		  Thread.sleep(1500);
		  //select add new
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[5]/ul/li[2]/a")).click();
		  System.out.println("Addnew offer");
		  System.out.println("Verifying page title : offer ");
		
		  // Verifying page title
		  String manoff_act = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		  String manoff_exp = ("Add New Offer");
		  Assert.assertEquals(manoff_act, manoff_exp);
		  System.out.println("Actual page title : "+ manoff_act);
			
		  //change advertise info
		  // Adding advertiser info
		  driver.findElement(By.xpath("//*[@id=\"offertitle\"]")).sendKeys("offauto10may02");
		  
		  //change publisher
		  WebElement radioBtn = driver.findElement(By.id("select_all_span"));

		  radioBtn.click();		  
		  
		  //change advertiser
		  //drop down 1 - Select adv
		  Select drpadv = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/select")));
		  drpadv.selectByVisibleText("Developer - Advertiser");
		  
		  //Check box for lead limit
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[6]/div[1]/div/ins")).click();
		
		  //Check box for date range
//		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[6]/div[2]/div/ins")).click();
		
		//Check box for unlimited
//		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[6]/div[3]/div/ins")).click();
		  
		 
		  //click on upload button
		 
		  // Change the image name to be added and add image in eclips folder
		  // Click on Browse button
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[10]/label")).click();
			Thread.sleep(5000);
			
			// Specify the file location with extension
			StringSelection sel = new StringSelection("Screenshot from 2018-04-09 15:51:47.png");

			// Copy to clipboard
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			System.out.println("selection" +sel);
					
			// Create object of Robot class
			Robot robot = new Robot();
			Thread.sleep(1000);
							
			// Press Enter
			robot.keyPress(KeyEvent.VK_ENTER);

			// Release Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
							
			// Press CTRL+V
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			// Release CTRL+V
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);

		//  Save offer
	/*	//	driver.findElement(By.xpath("//*[@id=\"coreg-ads\"]")).click();
			System.out.println("Image uploaded sucessfully");
			
			// Verifying page title
			  String ver_act = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/h4")).getText();
			  String ver_exp = ("Record Successfully Added");
			  Assert.assertEquals(ver_act, ver_exp);
			  System.out.println("Flash message : "+ver_act);*/
			  
	  }
	  
	  public void manage_offer_pages() throws InterruptedException
	  {
		//click on manage_offer
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[6]/a/span[1]")).click();
		  Thread.sleep(1500);
		  //select add new
		  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[6]/ul/li[2]/a")).click();
		  System.out.println("Addnew offer");
		  System.out.println("Verifying page title : Add New offer page");
		  
		  // Verifying page title
		  String offpg_act = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		  String offpg_exp = ("Add New Offer Page");
		  Assert.assertEquals(offpg_act, offpg_exp);
		  System.out.println("Actual page title : "+ offpg_act);
			
		  //change page title
		  // Adding page info
		  driver.findElement(By.xpath("//*[@id=\"offertitle\"]")).sendKeys("pageauto10may01");
		  // Add descripion
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[4]/textarea")).sendKeys("Nadsoft test page");
		  
		  //select adv 01
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/span/span[1]/span/ul/li/input")).sendKeys("advauto10may02 Nadsoft");
		  for(int i = 0; i <=1 ; i++){
			    Actions actions = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    Actions actions1 = new Actions(driver);
			    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
			}
		  //click outside
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).click();
		  
		//select adv 02
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/span/span[1]/span/ul/li/input")).sendKeys("advauto10may01 Nadsoft");
		  for(int i = 0; i <=1 ; i++){
			    Actions actions = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    Actions actions1 = new Actions(driver);
			    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
			}
		  //click outside
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).click();
		 Thread.sleep(1000);
		 
		  //select offer page 01
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[3]/span/span[1]/span/ul/li/input")).sendKeys("offauto10may02");
		  for(int i = 0; i <=1 ; i++){
			    Actions actions = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    Actions actions1 = new Actions(driver);
			    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
			}
		  //click outside
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).click();
		  Thread.sleep(1000);
		 
		  //select offer page 02
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[3]/span/span[1]/span/ul/li/input")).sendKeys("offauto10may01");
		  for(int i = 0; i <=1 ; i++){
			    Actions actions = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    Actions actions1 = new Actions(driver);
			    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
			}
		  //click outside
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).click();
		    
		  //add Thank you page
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[5]/input")).sendKeys("https://google.com");
		  // privacy url	  
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[6]/input")).sendKeys("https://privacy.com");
		  
		  //drop down 1 - Select status
		  Select drpsts = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[7]/select")));
		  drpsts.selectByVisibleText("Active");
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Submit")).click();
	  }
	  
}
