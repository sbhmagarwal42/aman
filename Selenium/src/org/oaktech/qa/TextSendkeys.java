package org.oaktech.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author hp
 * Text Field Methods
 * SendKeys(test) ---> This method used to enter values into text field or input box  
 * clear() ---> This method is used to delete text in an input box
 * getText()  --->  This method returns the text
 * getAttribute()  ---> This method is to get the text from page attributes properties
 * getPageSource()  ---> This method is used to check whether required text is there in webpage or not
 * 
 */

public class TextSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.eenadupellipandiri.net/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://www.gmail.com");
		
		
		
		//facebook
		/*driver.findElement(By.id("email")).sendKeys("QTP");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).submit();
		
		driver.navigate().back();
*/
		
		//********************  getText()  --->  This method returns the text **********************************
	    
		/*Thread.sleep(5000);
		String actual_value = driver.findElement(By.linkText("Forgotten account?")).getText();
		String exp_value="Forgotten";
				
		System.out.println("Actual Text :" + actual_value);
		System.out.println("Expected Text :" + exp_value);
		
		if(actual_value.contains(exp_value))   
		{
			System.out.println("Actual Expected values are equal using getText=====================");
		}
		else
		{
			System.out.println("Actual Expected values are not equal using getText======================");
		}
		*/
		
		
		
		//********************* getAttribute()  ---> This method is to get the text from text field **************
		
		/*String actual_value1=driver.findElement(By.linkText("Forgotten account?")).getAttribute("innerHTML");
		
				String exp_value1="Forgotten";
						
				System.out.println("Actual Text is:" + actual_value1);
				System.out.println("Expected Text is:" + exp_value1);
				
				if(actual_value1.contains(exp_value1))
				{
					System.out.println("Actual Expected values are equal using getAttribute=====================");
				}
				else
				{
					System.out.println("Actual Expected values are not equal using getAttribute !======================");
				}
		*/
		
		
		
		//**************** getPageSource()  ---> This method is used to check whether required text is there in WebPage or not ***********
				
		/*String str=driver.getPageSource();
		if(str.contains("ravikanth"))
		{
			System.out.println("Element Exist using PageSource");			
		}
		else
		{
			System.out.println("Element doesnot Exist using PageSource");
		}*/
		
		
		//String val=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getAttribute("innerHTML");
		//System.out.println(val);
		
		
		/*driver.findElement(By.id("email")).sendKeys("vmware");
		String v=driver.findElement(By.id("email")).getText();
		System.out.println(v);*/
		
		
		
		//driver.close();
		
		/*driver.findElement(By.id("name")).sendKeys("ravilella");
		String str=driver.findElement(By.id("name")).getAttribute("value");
		System.out.println(str);*/
		
		//((RemoteWebDriver)driver).executeScript("window.scrollBy(0,700)");
		/*String act=	driver.findElement(By.xpath(".//*[@id='dotd-info']/div[2]/div/a")).getAttribute("innerHTML");
		String exp="   Shop all deals ";
		
		System.out.println("Actual value is : " +act);
		System.out.println("expected value is:" + exp);
		
		if(act.equals(exp))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are equal");
		}*/
		
		
	}
}
