Feature: Search

  Scenario: Search open agent location near me
    When user click menu button "Find locations"
    When into a ZIP input enter zip code "08247" and hit enter button
    Then sort all locations by nearest
    Then get address details of the first one in console
