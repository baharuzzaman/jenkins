Feature: Window test

@popuptest
Scenario: Validate Popup test
Given I am in ToolsQA "https://www.toolsqa.com/testproject-tutorial/" page
When I click in SDLC link
Then New tab should be opened
And I would be able to navigate to the SDLC page