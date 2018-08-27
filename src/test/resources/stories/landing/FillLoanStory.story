Narrative:
As a user I want to ask for a loan and result page is loaded


Scenario: User fills loan selector and proceeds to results page
Given user is on landing page
When user fills loan selector with next data:
|usage |amount|period   |
|Wohnen|2750  |24 Monate|
And clicks Next button
Then credit request is displayed
And credit request page completely loaded
