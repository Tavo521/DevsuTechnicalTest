Feature: In this feature will add a pet then it will get the pet then it wil be updated and then it will find by status

  Background:
    * url api.baseUrl
    * def responseSuccessfulPost = read("successful-response-post.json")
    * def responseSuccessfulGet = read("successful-response-get.json")
    * def responseSuccessfulPut = read("successful-response-put.json")
    * def bodyRequest = read("pet-body-request.json")
    * def updateBodyRequest  = read("update-pet-body-request.json")

  Scenario Outline: Create a new pet, get it, update it and get it by status
    * call read("../post/add-new-pet-snippet.feature@Add")
    * call read("../get/get-pet-snippet.feature@Get")
    * call read("../put/update-pet-snippet.feature@Update")
    * call read("../getbystatus/get-pet-by-status-snippet.feature@GetByStatus")

    Examples:
      | id  | name     | newName      | status |
      | 100 | Roger    | Rogue        | sold   |

