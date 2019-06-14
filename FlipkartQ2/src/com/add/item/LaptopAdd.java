package com.add.item;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaptopAdd {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group022\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.limeroad.com/black-leatherette-lorenz-p14401785?imgIdx=0&src_id=5cfa52730ba19__5");
		driver.get("https://www.limeroad.com/kyc/?noPer=1&top_level=Men&occasion=watches&price=10&page=0");
		
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Actions act = new Actions(driver);
        
        driver.findElement(By.id("14401785")).click();
        driver.findElement(By.xpath("//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[3]/div[2]/div[2]")).click();
        
        

	}

}
