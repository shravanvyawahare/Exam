package com.verizon.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerizonLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group022\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("test1");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("test1");
		
		driver.findElement(By.name("login")).click();
		

	}

}
