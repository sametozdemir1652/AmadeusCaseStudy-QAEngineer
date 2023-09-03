
  Feature: 'From' and 'To' input fields

    Scenario: TC02 The user should NOT be able to enter the same value into the 'From' and 'To' input fields
      Given Go to the "https://flights-app.pages.dev" url
      When Enter the value into the From input field
      And Enter the same value into the To input field
      Then Verify that From and To input values are not same
      And Close the page


