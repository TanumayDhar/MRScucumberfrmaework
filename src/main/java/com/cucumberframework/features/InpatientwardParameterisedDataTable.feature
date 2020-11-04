#DataTable & Parameterised
Feature: Login as a Inpatient Ward and Creation of New Service type.

  Background: 
    Given User navigate to "https://demo.openmrs.org/openmrs/login.htm".
    When User enters username and password as
      | Admin | Admin123 |

  Scenario Outline: 
    And click on Inpatient Ward.
    And click on Log In button.
    Then user able to loged in to inpatient Ward as an Admin.
    And verifies user loged in to Inpatient ward.
    Then user selects Appointment Scheduling
    And selects Manage service Types
    And click on New Service Types
    And enters name as "<Service Test>"
    And enters Duration as "<duration>"
    And enters Description as "<describtion>"
    And user click on Save button.
    Then user verifies new creation of Service type.

    Examples: 
      | Service Test | duration | describtion |
      | service test |       10 | testing     |
