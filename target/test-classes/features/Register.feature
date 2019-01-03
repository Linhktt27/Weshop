Feature: Test Register
Background: 
    Given Access website https://weshop.com.vn
    And Click on button Login
    And Click on textlink Register
Scenario: Registter with null data
    When I don't fill data and click on button Register
    Then Show notify request fill information
Scenario: Register with data is space
    When I fill all field is space
    Then Show notify request fill infor valid
Scenario Outline: Register with username is invalid
    When I fill username is <username>
    And Fill phone number, email, password, confirm password exactly
    Then Show notify error <error> username
Examples:
     |username                 |  error |
     |"Kiều Linh 274"          |  "Tài khoản chỉ bao gồm ký tự từ a-z hoặc A-Z và 0-9 , Không bao gồm các kí tự cách và kí tư đặc biệt . Vui lòng thử lại bằng tài khoản khác!"|
     |"KieuLinh 274"           |  "Tài khoản chỉ bao gồm ký tự từ a-z hoặc A-Z và 0-9 , Không bao gồm các kí tự cách và kí tư đặc biệt . Vui lòng thử lại bằng tài khoản khác!"|
	   |"KieuLinh274@#@"         |  "Tài khoản chỉ bao gồm ký tự từ a-z hoặc A-Z và 0-9 , Không bao gồm các kí tự cách và kí tư đặc biệt . Vui lòng thử lại bằng tài khoản khác!"|
Scenario: Register with username had in system
    When I fill username had in system
    And Fill phone, email, password, confirm password exactly
    Then Show notify error username invalid	
Scenario Outline: Register with phone number is invalid
    When I fill phone <phone> invaliad
    And Fill username, email, password, repet password exactly
    Then Show notify error <error> phone number
Examples: 
     |phone                    |  error |
     |"adcdef1234"             |  "Số điện thoại chỉ bao gồm mã quốc tế đầu tiên và các số, vui lòng chọn số điện thoại khác"|
     |"(84)000000000"          |  "Số điện thoại chỉ bao gồm mã quốc tế đầu tiên và các số, vui lòng chọn số điện thoại khác"|
Scenario: Register with phone number had in system
    When I fill phone had in system
    And Fill username, email, password, confirm password exactly
    Then Show notify error phone number	
Scenario: Register with email is invalid
    When I fill email invaliad
    And Fill username, phone number, password, confirm password exactly
    Then Show notify error email invalid   
Scenario: Register with email had in system
    When I fill email had in system
    And Fill username, phone, password, confirm password exactly
    Then Show notify error email
Scenario: Register with password and password confirmation do not match
    When I fill password
    And I fill password confirm do not like password
    When Fill username, phone number, email exactly
    Then Show notify error password do not match