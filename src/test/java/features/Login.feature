Feature: Login

  Scenario Outline: Login success
    Given Open site
    When I input name <username>
    When I input name <username>
    Examples:
      | username          |
      | anshika@gmail.com |
#    And I enter password "Iamking@000"
#    And I click signIn