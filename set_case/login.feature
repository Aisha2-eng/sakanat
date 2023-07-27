
Feature: Admin login
   Description: The administrator logs into sakan system 
   Actor: Administrator
 


  Scenario Outline: Successful User Registration
   Given  Admin on the registration page
   When Admin enter his name as <Name>
   When Admin enter his password as <Password>
   Then Admin should log in successfully
   
   Examples:
     | Name | Password|
     | aisha | 2002|
     | arees | 2003|
  