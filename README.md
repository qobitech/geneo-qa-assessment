
# GENEO QA ASSESSMENT

## PROCESS IN WRITING AUTOMATION TEST FOR BBC WEBSITE (DESKTOP & MOBILE)
	
### General Test Scenarios -
	All error messages should be displayed in the same CSS style (For Example, using red color)
	General confirmation messages should be displayed using CSS style other than error messages style (For Example, using green color)
	Tooltips text should be meaningful.
	Check the functionality of buttons available on the page.
	Application crash or unavailable pages should be redirected to the error page.
	Check the text on all pages for spelling and grammatical errors.
	Check for timeout functionality. Timeout values should be configurable. Check application behavior after the operation timeout.
	Check cookies used in an application.
	Check that the cookies consent banner appears when it should and that it does not appear when it should not.
	Verify that selecting "Yes, I agree" makes the cookies consent banner disappear.
	Verify that selecting "No, take me to settings" redirects to the settings page.


### GUI & Usability Test Scenarios (Mobile & Desktop)-
	Enough space should be provided between columns, rows, etc.
	The scrollbar should be enabled only when necessary.
	Font size, style, and color for headline, description text, labels, infield data, and grid info should be standard as specified in SRS.
	All buttons on a page should be accessible by keyboard shortcuts and the user should be able to perform all operations using a keyboard.
	Check page for broken images.
	Check all pages for broken links.
	Page should have a title.
	Check the right menu items appear in the nav bar when it's desktop display, i.e: "home", "news", "sport", "reel", "travel", etc.
	Verify that the menu items are reduced to only include "home", "news" and "more" on mobile display.
	Check that "Sign in" is displayed as text beside the sign in icon on desktop and only the icon appears on mobile.
	

### Test Scenario for a Window -
	Check if the default window size is correct.
	Check if the child window size is correct.
	Check if child windows are getting closed on closing parent/opener window.
	If the child window is opened, the user should not be able to use or update any field in the background or parent window
	Check window minimize, maximize, and close functionality.
	Check if the window is re-sizable.
	Check scroll bar functionality for parent and child windows.
	Check cancel button functionality for the child window.


### Performance Testing Test Scenario -
	Check if the page load time is within the acceptable range.
	Check the page load on slow connections.
	Check the response time for any action under a light, normal, moderate, and heavy load conditions.
	Check for load testing of the application.
	Check for the Stress testing of the application.
	Check CPU and memory usage under peak load conditions.


### Security Testing Test Scenario -
	Secure pages should use the HTTPS protocol.
	Page crash should not reveal application or server info. The error page should be displayed for this.
	Error messages should not reveal any sensitive information.
	Cookie information should be stored in encrypted format only.
	Test for memory leakage.
	Test unauthorized application access by manipulating variable values in the browser address bar.
	Verify CAPTCHA functionality.
	Check if important events are logged inv log files.


### Write Accessibility Test Scenario -
Whether an application provides keyboard equivalents for all mouse operations and windows?
Whether instructions are provided as a part of user documentation or manual? Is it easy to understand and operate the application using the documentation?
	Check if shortcut keys are provided for menus?
	Check if response time is clearly mentioned so that End Users know how long to wait?
	Check if all labels are written correctly in the application?
	Check if color of the application is flexible for all users?
	Test whether images or icons are used appropriately, so it's easily understood by the end users?
	Test for audio alerts?
	Check to ensure that color-coding is never used as the only means of conveying information or indicating an action
    Test that the highlighting is viewable with inverted colors? (testing of color in the application by changing the contrast ratio)


## HOW CAN THE MOBILE VS DESKTOP TESTS BE WRITTEN TO EASILY MANAGE THE INTRODUCTION OF CHANGES THAT AFFECT BOTH RESOLUTION ?

Test should be designed to be adaptive.

It should be written to find out what is different, or what updates or features has been added to the application

inorder not to slow development and also to provide feedback early.

### This could mean -
	Checking version control for what actually changed in the release
	Studying production logs for what features customers are using


 
## AFTER A SUCCESSFUL SMOKE TESTING EXERCISE, HOW MIGHT YOU IMPROVE ON THE SOFTWARE TESTS OR TESTING PROCESS OVER A YEAR OR 2 AFTER FULL TEST COVERAGE

To be updated with the latest knowledge as well continuously provide more qualitative inputs to make a product better (in short, find more bugs).



## WHAT DIRECTION DO YOU SEE YOURSELF TAKING YOUR SKILLS IN RELATION TO QUALITY ASSURANCE TESTING OVER THE NEXT 5 YEARS?

Over the next few years, I want to explore and develop skills in quality assurance. 
In five years, I want to have gained experience in leading projects for major clients. 
I will be looking for opportunities to expand my responsibilities within this role to work towards my goal.



NOTE THAT YOU CAN ALSO IMPLEMENT AUTOMATION TESTS TO COVER POINTS 1 - 7 ABOVE ND SUBMIT  LINK TO THE Github/Bitbucket URL with the exposition as your README


