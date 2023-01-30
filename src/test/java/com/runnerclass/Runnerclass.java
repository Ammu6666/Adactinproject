package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;

public class Runnerclass extends Baseclass {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement username=driver.findElement(By.id("username"));
		inputValueElement(username,"Ammusuma123");
		WebElement password=driver.findElement(By.id("password"));
		inputValueElement(password,"Ammaachan@123");
		WebElement login=driver.findElement(By.id("login"));
		clickonElement(login);
		dropdown(username,"value");
		
		
	}
	private static void dropdown(WebElement username, String string) {
		// TODO Auto-generated method stub
		
	}
	private static WebDriver close() {
		// TODO Auto-generated method stub
		return null;
	}
	private static void clickonElement(WebElement login) {
		// TODO Auto-generated method stub
		
	}
	public static WebDriver browserLaunch(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	private static void getUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	private static void inputValueElement(WebElement username, String string) {
		// TODO Auto-generated method stub
		
	}

}
