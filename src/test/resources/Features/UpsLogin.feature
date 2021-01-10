Feature: UPS Login Feature
  This feature is for UPS login functionality

  @Sanity
  Scenario: Verify customer able to launch the UPS login page successfully  
    Given Customer launch in UPS home page
    When Customer clicks on login 
    Then Customer able to launch in UPS login page successfully
    
  @Regression 
  Scenario: Verify customer login using wrong username and wrong password
    Given Customer launch in UPS home page
    And Customer clicks on login 
  	And Customer able to launch in UPS login page successfully
  	When Customer put wrong Username "Hello" and wrong Password "World123"
  	And Customer clicks on LogIn button
  	Then Customer should receive an error message
 
  @Sanity @Regression
  Scenario Outline: Verify customer login using correct username and wrong password
    Given Customer launch in UPS home page
    And Customer clicks on login 
  	And Customer able to launch in UPS login page successfully
  	When Customer put correct Username "<username>" and wrong Password "<password>"
  	And Customer clicks on LogIn button
  	Then Customer should receive an error message

    Examples: 
      |username|password|
      |John    |john123 |
      |Ironman |avengers|
      |Tom     |Jery123 | 
      
