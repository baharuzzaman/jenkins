Feature: MouseHover Test

@MouseHover
Scenario: Validate Mouse Hover in Myntra Page
Given Customer in Myntra homepage "https://www.myntra.com/"
When Customer wants to access the Men's watches
Then Customer should be able to navigate to the watches page