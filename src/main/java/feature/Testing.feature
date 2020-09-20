
@GitloginFeature
Feature: GIT Hub Application
  I want to use this template for my feature file

  @LoginApplication
  Scenario: User Login validation
    Given User launch Browser
    When user launch application
    And User Click on Login Button
    And User enter User email as "krishvasudevan2@gmail.com"
    And User enter password as "passwd"
    Then Validate Application login successfull
