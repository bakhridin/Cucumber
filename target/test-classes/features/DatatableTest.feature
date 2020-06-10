Feature: Data Table Test
   @test
  Scenario: Login with invalid credentials
    When user enter invalid username and password and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |
