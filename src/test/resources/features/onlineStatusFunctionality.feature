Feature: Online Status Functionality
  Agile story: As a user, I should be able to change my online status and set a status message

  Background:
  Given: the user is on the home page.

@CEA-980
  Scenario: User can view Online Status
    Given user is on home page
    When user navigate to user button and clicks
    And user navigate to Set status button and click
    And user navigate to Online_Status/Online_Button and click
    And user navigate to CLOSE BUTTON and click
    And user navigate to USER button and click
    And user navigate to SET status button
    Then User sees expected Button Title Online

  @CEA-981
  Scenario Outline:User can change Online Status
    Given user is on CealoHomePage
    When user go to "<OnlineStatusButton>" and click
    Then User verify "<expectedTitle>"

    Examples:
      |OnlineStatusButton|expectedTitle  |
      |Online            |Online         |
      |Away              |Away           |
      |Do not disturb    |Do not disturb |
      |Invisible         |Invisible      |

@CEA-982
  Scenario: User can  set a status message from any default options
    Given user is on cealoHome page
    When user navigate to userButton and clicks
    And user navigate to SetStatus button and click
    And user navigate to StatusMessage/inAmeeting button and click
    And user navigate to SetStatusMessage button and click
    And  user navigate to userButton and click
    And user navigate to SetStatus button
    Then User sees expected ButtonTitle In a meeting

@CEA-983
  Scenario: User can set a custom status message with also using any emoji option provided
    Given user is on CEALOhome page
    When user navigate to userBUTTON and clicks
    And user navigate to SetStatus BUTTON and click
    And user enters custom status message
    And user choose emoji
    And user navigate to SetStatusMessage BUTTON and click
    And  user navigate to userBUTTON and click
    And user navigate to SetStatus BUTTON
    Then User sees expected ButtonTitle Happy hours

@CEA-984
  Scenario: User can clear status message or set a time to clear the message automatically
    Given user is on CEALO home page
    When user navigate to user BUTTON and clicks
    And user navigate to Set Status BUTTON and click
    And user navigate to CLEAR Status BUTTON and click
    And  user navigate to user BUTTON and click
    And user navigate to Set Status BUTTON
    Then User sees expected Button Title


