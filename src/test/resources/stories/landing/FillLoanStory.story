
Scenario: User fills loan selector and proceeds to results page
Given user is on landing page
When user fills loan selector with next data:
|usage |amount|period   |
|Wohnen|2750  |24 Monate|
And clicks Next button
Then result page is displayed
And page completely loaded
