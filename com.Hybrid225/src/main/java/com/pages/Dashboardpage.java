package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dashboardpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//p[text()='Manual Testing(ISTQB)']")).click();
		
		String val=driver.findElement(By.name("count")).getAttribute("value");	
		System.out.println(val);
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("2111122222");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.xpath("//*[@id=\"myaccount\"]/a[1]")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.scrollBy(0,500)");
}
}


