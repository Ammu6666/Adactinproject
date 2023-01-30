package com.runnerclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;
import com.pom.Loginpage;

public class PageObjectManager extends Baseclass{
	public static Loginpage lp=new Loginpage();
	
	
	public static WebDriver driver;
	
public static void main(String[] args) {
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	PageFactory.initElements(driver,Loginpage.class);
	Loginpage lg=new Loginpage();
	Loginpage.username.sendKeys("Ammusuma123");
	Loginpage.password.sendKeys("Ammaachan@123");
	Loginpage.login.click();
	Loginpage.Location.click();
	Loginpage.Hotel.click();
	Loginpage.RoomType.click();
	Loginpage.Number_of_Rooms.click();
	Loginpage.check_in_Date.sendKeys("22/01/2023");
	Loginpage.check_out_Date.sendKeys("23/01/2023");
	Loginpage.Adults_per_Room.click();
	Loginpage.childrens_per_room.click();
	Loginpage.search.click();
	Loginpage.radiobutton.click();
	Loginpage.contin.click();
	/////////////////////////////////
	Loginpage. firstname.sendKeys("Ammu");
	Loginpage.lastname.sendKeys("sumaraj");
	Loginpage.address.sendKeys("address");
	Loginpage.ccnum.sendKeys("1244565666672345");
	Loginpage.cctype.click();
	Loginpage.expdatemonth.click();
	Loginpage.expyear.click();
	Loginpage.cvvnum.sendKeys("233");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

public Object getInstanceLogIn;

}
