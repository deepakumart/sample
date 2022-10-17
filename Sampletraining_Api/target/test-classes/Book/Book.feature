Feature:Book site
Scenario:searching book
Given user is on Google home page
When user Enter The book name in search  box 
And user click on the search button
Then Its navigate to search result page
 
Scenario:user validating Ikigai book details
When user get rating of the Ikigai book in amazon site 
And user get review of the Ikigai book in amazon site 
And user get author name of the Ikigai book in amazon site 
Then user close the window