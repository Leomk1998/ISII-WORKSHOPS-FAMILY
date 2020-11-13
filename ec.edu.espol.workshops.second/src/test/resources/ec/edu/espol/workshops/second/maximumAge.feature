Feature: Not allow age
	Scenario: greather than 80
		Given customer age is greather than 80
		When i ask you for you <age>
		Then I should be told the age and the value of your <prima>
	
	Examples: 
      | age | prima |
	  | 85 | -1 |
	  | 90 | -1 |