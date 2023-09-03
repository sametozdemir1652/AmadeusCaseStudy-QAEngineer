
  Feature: 'From' and 'To' input fields

    Scenario: TC01 The user should enter the different values in the 'From' and 'To' input fields
      Given Go to the "https://flights-app.pages.dev" url
      When Enter the value into the From input field
      And Enter the value into the To input field
      Then Verify that From and To input values are not same
      And Close the page


