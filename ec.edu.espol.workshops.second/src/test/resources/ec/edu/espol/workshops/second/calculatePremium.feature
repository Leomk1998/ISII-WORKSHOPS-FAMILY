Feature: Calculate the insurance prime for a man
	Scenario: Customer is not married and is m
		Given customer is not married
		When i ask you for you <marriage>
		Then i should get <marriage>
	
	Examples: 
      	| sex | marriage | price |
	| M | married | 300 |
	| F | not married | 500 |
	  
	