@us1
Feature: As a data consumer, I want the user information are stored in mySql DB correctly in users table.
  ##Background: If we can start without given we can delete background
  ##  Given Establish the database connection

  Scenario: verify users has unique IDs

    When Execute query to get all IDs from users
    Then verify all users has unique ID

  Scenario: verify users table columns

    When Execute query to get all columns
    Then verify the below columns are listed in result
      | id            |
      | full_name     |
      | email         |
      | password      |
      | user_group_id |
      | image         |
      | extra_data    |
      | status        |
      | is_admin      |
      | start_date    |
      | end_date      |
      | address       |


