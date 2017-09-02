

package org.oaktech.qa;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch 
{

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("hi");
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		
		driver.quit();
		
		
		
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("http://www.amazon.in");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.navigate().to("http://www.flipkart.com");*/
	

	}

}
