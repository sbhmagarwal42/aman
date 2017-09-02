package org.oaktech.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	int i=10;
	float f=10.00f;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eenadupellipandiri.net/register");
	
		driver.findElement(By.id("name")).sendKeys("ravilella");
		
		driver.findElement(By.name("name")).clear();
		
		driver.findElement(By.className("textlbl")).sendKeys("subham");
		
		driver.findElement(By.name("name")).clear();
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("selenium");
		
		//driver.findElement(By.linkText("Register Now")).click();
		
		//driver.findElement(By.partialLinkText("Pellipandiri")).click();
		
		driver.findElement(By.xpath(".//*[@id='gender']")).click();
		
		
	}

}
