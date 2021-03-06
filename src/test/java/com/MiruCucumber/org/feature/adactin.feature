Feature: Login functionality for adactin application

Scenario: User enter valid username and valid password and click login
	Given enter url of adactin application
	When user enter "Mirunalini" as username
	And user enter "12345678" as password
	And user click login button
	Then user validate login button
	
	Scenario: User to search hotel with all details
	When select location of hotel
	And select hotel type
	And select room type
	And select number of rooms
	And enter "24/06/2021" as Check in date
	And enter "25/06/2021" as Check out date
	And select no of adults
	And select number of childrens
	Then click search button
	
	Scenario: selecting hotel
	When Select the hotel
	Then click continue button
	
	Scenario: booking a hotel
	When Enter "miru" as firstname
	And enter "vignesh" as lastname
	And enter "dsvgdbh" as billing address
	And enter "1111222233334444" as card number
	And select card type
	And select exp month
	And select exp year
	And enter cvv num
	Then click book now button
	
	Scenario: conform booking
	When click logout button