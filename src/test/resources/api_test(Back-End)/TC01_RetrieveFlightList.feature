
  Feature: Flight list

    Scenario: TC01 Retrieve flight list
      Given Send a GET request to the API
      Then Verify the HTTP status code
      And Verify the Content-Type
      And Verify that response body is in desired format





