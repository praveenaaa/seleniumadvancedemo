package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo2 {
	WebDriver driver;

@Test(priority=2,enabled=false)

public void legister () {
	
	driver.findElement(By.linkText("SignUp")).click();
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	driver.findElement(By.xpath("//img[@alt='Ch']")).click();
	Select s2 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	s2.selectByVisibleText("Feb");
	Select s3 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	s3.selectByVisibleText("1995");
	driver.findElement(By.xpath("//a[contains(.,'28')]")).click();
}

@Test(priority=1,enabled=true)

public void login() throws Exception {
	
	 driver.findElement(By.linkText("SignIn")).click(); 
	 driver.findElement(By.name("userName")).sendKeys("lalitha");
	 driver.findElement(By.name("password")).sendKeys("password123");
	 driver.findElement(By.name("Login")).click();
	 
//	 driver.findElement(By.linkText("SignOut")).click();
	 
//	 driver.findElement(By.linkText("All Categories")).click();
//	 driver.findElement(By.linkText("Electronics")).click();
//	 Thread.sleep(2000);
//	 driver.findElement(By.linkText("Head Phone")).click();
WebElement mainMenu = driver.findElement(By.xpath("//span[contains(.,'All Categories')]"));
WebElement subMenu = driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
//WebElement subMenu1 = driver.findElement(By.xpath("//span[contains(.,'Head Phone')]"));				
Actions act = new Actions(driver);
	
act.moveToElement(mainMenu);
//Thread.sleep(3000);

	act.moveToElement(subMenu);
	 Thread.sleep(3000);	
	act.click().build().perform();
	 Thread.sleep(3000);	
	driver.findElement(By.xpath("//span[contains(.,'Head Phone')]")).click();
	 
	
	

    
   

	 
	 Thread.sleep(3000);
}

@BeforeTest

public void launch_browser () {
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://10.250.88.214:8083/TestMeApp");
	
	
}

@AfterTest 

public void close_browser () {
//	driver.close();
	
	
}




}
