Feature: Test Register
Background: 
    Given Access website https://weshop.com.vn
    And Click on button Login
Scenario: Login with null data
    When I don't fill data and click on button Login
    Then Show notify request fill information
Scenario: Login with username invalid
    When I fill username invalid is Weshopwww
    And I fill password is 123456
    Then Show notify inform username invalid
Scenario: Login with password invalid
    When I fill username is heobeo12
    And I fill password invalid is 12345678
    Then Show notify inform password invalid
Scenario: Login with account exactly
    When I fill username exactly is heobeo12
    And I fill password exactly is 123456
    Then Show inform login success