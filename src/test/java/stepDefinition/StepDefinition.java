package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
public static WebDriver driver=RunnerClass.driver;



@Given("user must select the options$")
public void user_must_select_the_options()throws Throwable {
	WebElement location=driver.findElement(By.id("\"location\""));
}
    
@When("user search Location in the select Location field$")
public void user_search_location_in_the_select_location_field() {
    
}
@When("user select hotels in the search hotels field")
public void user_select_hotels_in_the_search_hotels_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user select Room type in the search Room type Field")
public void user_select_room_type_in_the_search_room_type_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user select Room Nos in the select Room Nos field")
public void user_select_room_nos_in_the_select_room_nos_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user Enter the Datepick_In And clear Datepick_In Field")
public void user_enter_the_datepick_in_and_clear_datepick_in_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user Enter The Datepick_In And pass SendKeys Datepick_out_Field")
public void user_enter_the_datepick_in_and_pass_send_keys_datepick_out_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user Enter the Adult_Room In The Adult_Room Field")
public void user_enter_the_adult_room_in_the_adult_room_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("user Enter the Child_Room in the Child_Room Field")
public void user_enter_the_child_room_in_the_child_room_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("user click the Submit Button")
public void user_click_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


