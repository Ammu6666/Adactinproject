package stepDefinition;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",glue= {"stepDefinition"})
public class RunnerClass{
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}

