Feature: productHotel1

  #Scenario Outline: Non Instant Payment
    #Given The tiket page is loaded successfully
    #When I click hotel menu bar
    #Then I input destination
    #Then Select first hotel also first room
    #Then Login with facebook account
    #Then input detail pemesanan page
    #Then Close the browser
    #
#		Examples: 
      #| firstOperand | secondOperand | result |
      #| 10           | 20            | -10    |

      
  Scenario Outline: Product Flight
    Given The tiket page is loaded successfully
    When I click pesawat menu bar
    Then I input destination flight
    Then input detail pemesanan flight page
    Then Close the browser
    
		Examples: 
      | firstOperand | secondOperand | result |
      | 10           | 20            | -10    |
  