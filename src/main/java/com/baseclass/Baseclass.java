package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
//browser launch
public static WebDriver LaunchBrowser(String browsername) {
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ammus\\eclipse-workspace\\cucumberjava2\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	return driver;
	
}

// Url launch
public static void LaunchUrl(String url) {
	driver.get("https://adactinhotelapp.com/");
}
//CLOSETAB
public static WebDriver CloseTab() {
	driver.close();
	return driver;
}
//closewindow
public static WebDriver Quit() {
	driver.quit();
	return driver;
}
//passinput
public static void passInput(WebElement element,String input) {
	element.sendKeys(input);
	
}
//clickonelement
public static void ClickOnElement(WebElement element) {
	element.click();
}
//clear
public void deleteInput(WebElement element) {
	element.clear();
}
//Navigate to
public static void navigateTo(String urlto) {
	driver.navigate().to(urlto);
}
//NavigateBack
public static void navigateBack() {
	driver.navigate().back();
	
}
//navigate forward
public static void navigateforward() {
	driver.navigate().forward();
}
//navigate refresh
public static void navigateRefresh() {
	driver.navigate().refresh();
}
//get window handles
public static void getWindowHandles() {
	driver.getWindowHandles();
	
}
//get title
public static void getTitle() {
	driver.getTitle();
	
}
//get page source
public static void getPgeSource() {
	driver.getPageSource();
	
}
//get window handle
public static void getWindowHandle() {
	
String h=driver.getWindowHandle();
System.out.println(h);
}

//get current url
public static void getCurrentUrl() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
}

//get text
public static void getText(WebElement element)
{
	String T=element.getText();
	System.out.println(T);
}


//DROPDOWN
public static void dropdown(WebElement element,String type,String value,int Index) {
	Select R=new Select(element);
	if(type.equalsIgnoreCase("value")) {
		
		R.selectByValue(value);
	}else if (type.equalsIgnoreCase("index")) {
		R.selectByIndex(Index);
	}else if (type.equalsIgnoreCase("visibleText")) {
		R.selectByVisibleText("value");
	}
}


//Screenshot
{
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\ammus\\eclipse-workspace\\cucumberjava2\\pic\\pic1.png");
}

//Radio button
public static void radioButton(WebElement element) {
	element.click();
}
//scroll up and down
public static void scrollupDown(String str,WebElement element)
{
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript(str, element);
}
//implicit wait
public static void wait(int timeOutInSeconds) {
	driver.manage().timeouts().implicitlyWait(timeOutInSeconds,TimeUnit.SECONDS);
}
//Alert Accept
public static void alertAccept() {
	Alert m=driver.switchTo().alert();
	m.accept();
}
	//alert dismiss
	public static void alertDismiss() {
		Alert D=driver.switchTo().alert();
		D.dismiss();
	}
	//ALERT DIALOGUEBOX SENDKEYS
	public static void alertDialogueBoxsendkeys(String Input) {
		Alert g=driver.switchTo().alert();
		g.sendKeys(Input);
	}
	//Get alert text
	public static void getAlertText() {
		Alert tex=driver.switchTo().alert();
		System.out.println(tex.getText());
	}
	//actions object
	public static Actions actionsObject() {
		Actions act=(Actions)driver;
		return act;
		
	}
	//Actions drag and drop
	public static void draganddrop(WebElement element,WebElement elements) {
		actionsObject().dragAndDrop(element, elements).click().build().perform();
		
	}
	//actions click
	public static void actions(WebElement element) {
		actionsObject().click(element).perform();
	}
	//actions movetoelement
	public static void moveToElement(WebElement element) {
		actionsObject().moveToElement(element).perform();
	}
	//actions context click
	public static void contextClick(WebElement element) {
		actionsObject().contextClick(element).perform();
	}
	//actions double click
	public static void doubleClick(WebElement element) {
		actionsObject().doubleClick(element).perform();
	}
	//Robot object
	public static Robot robotObject() throws AWTException {
		
	Robot Ro=new Robot();
	return Ro;
}
	//Robot upkeypress and release
	public static void upkey() throws AWTException {
	robotObject().keyPress(KeyEvent.VK_UP);
	robotObject().keyRelease(KeyEvent.VK_DOWN);
	}
	//Get Options
	public static void getOptions(WebElement element) {
		Select st=new Select(element);
		List optionslist=(List) st.getOptions();
		optionslist.getClass();
		}
	
		//getallselectedoptions
public static void getAllSelectedOption(WebElement element) {
	Select st=new Select(element);
	List opt=(List) st.getAllSelectedOptions();
	opt.getClass();
	}
//webtablealldata

public static void allDataWebTable(List elements) {
	List Listdt = elements;
	WebElement[] dt = null;
	for(WebElement alldatas:dt) {
		System.out.println(alldatas.getText());
	}
}
//is enabled
public static void isEnabled(WebElement element) {
	System.out.println(element .isDisplayed());
}
//is selected
public static void isSelected(WebElement element) {
	System.out.println(element.isSelected());
}
//ismultiple
public static void ismultiple(WebElement element) {
	Select y=new Select(element);
	System.out.println(y.isMultiple());
}
//frameid
public static void frameId(String id)
{
	driver.switchTo().frame(id);
}
public static void frameIndex(int Index) {
	driver.switchTo().frame(Index);
}
//frame webelement
public static void frameWebElement (WebElement element) {
	
driver.switchTo().frame(element);
}
//frame leave
public static void frameleave() {
	driver.switchTo().defaultContent();
}
public static void outerFrame() {
	driver.switchTo().parentFrame();
}
}

