package com.runnerclass;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

public class Runnerclassforpom extends Baseclass{
	public static WebDriver driver=LaunchBrowser("chrome");
    public static PageObjectManager pom=new PageObjectManager();

    public static void main(String[] args) {
		LaunchUrl("https://adactinhotelapp.com/");
		
    //login
   passInput(pom.getInstanceLogIn.getUsername(),"Ammusuma123");

