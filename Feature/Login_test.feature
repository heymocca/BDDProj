Feature: login and logout

Scenario: Successful Login with Valid Credentials
	Given User is on EmailTpreList Page
	When User Navigate to Google Mail LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully