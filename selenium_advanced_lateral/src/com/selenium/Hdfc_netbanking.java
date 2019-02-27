package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_netbanking {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    int total_frame=driver.findElements(By.tagName("frame")).size();
	    System.out.println(total_frame);
	    driver.switchTo().frame(1);
	    driver.findElement(By.linkText("Privacy Policy")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.findElement(By.name("fldLoginUserId")).sendKeys("444378");

	}

}
