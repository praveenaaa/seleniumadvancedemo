package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hello_selenium {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(" http://newtours.demoaut.com/");
	    driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.name("firstName")).sendKeys("pravin");
	    
	    driver.findElement(By.name("lastName")).sendKeys("singh");
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("pravinsingh918@gmail.com");
//      driver.findElement(By.name("country")).sendKeys("INDIA");
	  WebElement CNT=driver.findElement(By.name("country"));
	  Select s1= new Select(CNT);
//	  s1.selectByVisibleText("INDIA");
//	  s1.selectByValue("92");
	  s1.selectByIndex(92);
	  
	  driver.findElement(By.name("register")).click();
	  driver.findElement(By.partialLinkText("sign-in" )).click();
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  
//	  login
	  driver.findElement(By.name("login")).click();
	  
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	  
	  driver.close();
	  driver.quit();
	}

}










