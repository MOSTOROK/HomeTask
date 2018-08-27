Meta:

Narrative:
As a user I want to click on “Anmelden” and be able to introduce data,
 but not being able to log-in because the data is not correct.

Scenario: Verify Error Message with incorrect data
Given user is on landing page
When user click on Anmelden button
And type '<email>' in log in field
And type '<password>' in password field
And clicks Anmelden button on LogIn popup
Then '<errorMessageLogin>' should be displayed under Login field
And '<errorMessagePass>' should be displayed under Password field
Examples:
|email          |password|errorMessageLogin                 |errorMessagePass                  |
|123            |        |Bitte überprüfen Sie Ihre Eingabe.|Bitte überprüfen Sie Ihre Eingabe.|

Scenario: Verify User able to type login and pass
Given user is on landing page
When user click on Anmelden button
And type '<email>' in log in field
And type '<password>' in password field
Then log in field has value '<email>'
And password field has value '<password>'
Examples:
|email            |password|
|123              |        |
|                 | pass   |
|email@email.email|pass    |

