Feature: Hotel booking in Adactin Application
Scenario: User login the web application
Given user launch the adactin application
When user enter the username in username field
And user enter the password in password field
Then user click the login button and it navigates search Hotel page
Scenario:Search Hotel Functionality
Given user must select the options
When user search Location in the select Location field
When user select hotels in the search hotels field
When user select Room type in the search Room type Field
When user select Room Nos in the select Room Nos field
When user Enter the Datepick_In And clear Datepick_In Field
And user Enter The Datepick_In And pass SendKeys Datepick_out_Field
When user Enter the Adult_Room In The Adult_Room Field
And user Enter the Child_Room in the Child_Room Field
Then user click the Submit Button
Scenario: Select page functionality
Given user must select the page options
When user click the Radio Button
Then user Click The continue Button And it Navigates To the Book Hotel page
Scenario:Book page Functionality
Given Enter the options
When user Enter the Fname in the Fname Field
When user Enter the Lname in the Lname Field
When user Enter the Address in the Address Field
When user Enter the Cccno in the Ccno Field
When user select Cct in the Cct field
And user Select Em in the Em field
And user select Ey in the Ey field
When user Enter The Cvv in the Ccv field
Then user click the Book Now Button
Scenario:Logout page functionality
Then user Click the Logout Button And Exit The Application
Scenario: Logout page functionality
Then to take Screen shot