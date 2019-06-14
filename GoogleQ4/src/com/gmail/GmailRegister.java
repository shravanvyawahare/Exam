package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group022\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.name("firstName")).click();
		driver.findElement(By.name("firstName")).sendKeys("varad");
		
		driver.findElement(By.name("lastName")).click();
		driver.findElement(By.name("lastName")).sendKeys("kulkarni");
		
		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("borntalentedvarad007");
		
		driver.findElement(By.name("Passwd")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Vk007@123");
		
		driver.findElement(By.name("ConfirmPasswd")).click();
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Vk007@123");
		
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();		

	}

}
