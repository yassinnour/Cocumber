Feature: login 
Scenario:  Valid users should be able to login 
         Given valid user   
         When user goes to Techfios webSite              
         Then user should be landed in login page    
         When user logs in with valid username "demo@techfios.com" password "abc123"
         Then the Dashboard page should display   
         
        
        
Scenario Outline: C002  Users would be able to add new account 
	Given a user already logged in as "<userName>" and "<passWord>"  
	When user navigate to Bank Cash -> New Account Page 
	Then New Accounts Page should display 
	When user submits "<title>", "<description>" and "<balance>""<accountNumber>" "<contact>""<phone>" 
	Then created account should be posted 
	
	Examples: 
	|userName         |passWord|title      |description|balance|accountNumber|contact|phone    |
	|demo@techfios.com|abc123  |TestAccount|Saving     |999    |	567890   |Nour   |555577777|
	