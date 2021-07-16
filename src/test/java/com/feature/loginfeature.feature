Feature: User Launch All Ecommerce website
Scenario Outline: Launch Flipkart website  
When User Enter urlname in address bar "<urlname>"
When User Enter username and password
Then User Enter Flipcart homepage
Examples:
|urlname|
|https://www.amazon.in/|
