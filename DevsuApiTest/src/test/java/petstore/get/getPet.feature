Feature: Get the new pet added

  Background:
    * url api.baseUrl
    * def responseSuccessful = read("successful-response-get.json")

    Scenario Outline: Get the pet added previously
      Given path '/pet/100'
      When method get
      Then status 200
      And match $ == responseSuccessful

      Examples:

      | id  |
      | 100 |

    Scenario Outline: Get the pet by status
      Given path '/pet/findByStatus'
      And params {status: "#(status)"}
      When method get
      Then status 200

      Examples:
      | status |
      | sold   |


