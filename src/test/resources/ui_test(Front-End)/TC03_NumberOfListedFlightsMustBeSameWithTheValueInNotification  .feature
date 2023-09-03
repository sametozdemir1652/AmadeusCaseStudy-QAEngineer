
  Feature: Number of listed flights

    Scenario: TC03 The number of listed flights must be the same as X in "Found X items"
      Given Go to the "https://flights-app.pages.dev" url
      When Enter the value into the From input field
      And Enter the value into the To input field
      Then Verify that the value of X in -Found X items- is same with number of listed flights
      And Close the page




