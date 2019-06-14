package com.signin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group022\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
        driver.get("https://www.verizonwireless.com/homepage/");		
	
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
        
        //Below Actions are for moving mouse to My account drop-down
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("gnavAccountMenu"))).build().perform();

        //To Click sign in button
        driver.findElement(By.linkText("Sign In")).click();
	}

}
