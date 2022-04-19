
Feature: As a librarian, I want to know the genre of books are being borrowed the most

  Scenario:verify the common book genre that’s being borrowed
    When I execute a query to find the most popular book genre
    Then verify that "Classic" is the most popular book genre.