package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
   @FindBy(id="username")
public static WebElement  username;
   @FindBy(id="password")
public static WebElement password;
   @FindBy(id="login")
public static WebElement login;
   @FindBy(xpath="//option[@value='Melbourne']")
public static  WebElement Location;
   @FindBy(xpath="//option[@value='Hotel Sunshine']")
public static WebElement Hotel;
   @FindBy(xpath="//option[@value='Deluxe']")
public static WebElement RoomType;
   @FindBy(xpath="//option[@value='2']")
public static WebElement Number_of_Rooms;
   @FindBy(name="datepick_in")
public static WebElement check_in_Date;
   @FindBy(name="datepick_out")
public static WebElement check_out_Date;
   @FindBy(xpath="//option[@value='2']")
public static WebElement Adults_per_Room;
   @FindBy(xpath="//option[@value='2']")
public static WebElement childrens_per_room;
   @FindBy(xpath="//input[@name='Submit']")
public static WebElement search;
   @FindBy(xpath="//input[@name='radiobutton_0']")
public static WebElement radiobutton;
 @FindBy(xpath="//input[@name='continue']")
public static WebElement contin;
 @FindBy(name="first_name")
public static WebElement firstname;
 @FindBy(name="last_name")
public static WebElement lastname;
 @FindBy(name="address")
public static WebElement address;
 @FindBy(name="cc_num")
public static WebElement ccnum;
@FindBy(xpath="//option[@value='MAST']")
public static WebElement cctype;
@FindBy(xpath="//option[@value='3']")
public static WebElement expdatemonth;
@FindBy(xpath="//option[@value='2017']")
public static WebElement expyear;
@FindBy(xpath="//option[@name='cc_cvv']")
public static WebElement cvvnum;


 
 
}



