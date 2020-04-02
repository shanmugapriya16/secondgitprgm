package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetData extends Mavenclr {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\sele\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.adactin.com/HotelApp/");
	WebElement username = d.findElement(By.id("username"));
	username.sendKeys(getdat(1,0));
	

	
	
	
	
}
}
