Feature: Application Login 

Scenario: HomePage default Login 

	Given User is on Loading Page "https://www.amazon.com/"
	
	When Login to "https://www.amazon.com/"
	
	Then Home page populated 
	
	And Close Driver 