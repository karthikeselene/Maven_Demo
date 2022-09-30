Feature: Sauce Demo is site used to cart sauce lab merchandise product

  Scenario: Already registered user can able to login into Sauce Demo site wihtout facing any error
    Given User want to purchase the sauce lab merchandise product on the offical cart site
    When Regitered user able to login with valid user credentials "standard_user" and "secret_sauce"
    Then User able to redirect into the inventory page

  Scenario: Login to the app with password
    Given I am on the login screen
    When I enter my passcode
    Then I press the ok button
