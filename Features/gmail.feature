Feature: Gmail Feature File

  @Login
  Scenario: Login scenario test for Gmail
    Given navigate to Gmail page
    When user logged in using username as "1802275.ece.cec@cgc.edu.in" and password as "Payal@123"
    Then home page should be displayed
  @Search
  Scenario: Search scenario test
    Given User is able to open gmail
    When user search "Demo Mail Gmail Check" in the search box
    And Relevent mail should be displayed
    And User should able to open the mail
    Then User should able to logout successfully
