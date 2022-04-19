package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.DashboardPage;
import com.library.pages.US2;
import com.library.utility.ConfigurationReader;
import com.library.utility.DB_Util;
import com.library.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2Atakan {

    String actualBarrowedBook;

    @Given("I am in the homepage of the library app")
    public void i_am_in_the_homepage_of_the_library_app() {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       BasePage basePage=new BasePage();
       basePage.loginLibrarian();
    }
    @When("I take borrowed books number")
    public void i_take_borrowed_books_number() {
        DashboardPage homepage=new DashboardPage();
        actualBarrowedBook=homepage.barrowedBooksNum.getText();
        System.out.println("actualBarrowedBook = " + actualBarrowedBook);
    }
    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {
    //    DB_Util.createConnectionLibrary();
        DB_Util.runQuery(US2.barrowedBooks);
        String expectedBarrowBooks=DB_Util.getFirstRowFirstColumn();
        System.out.println("expectedBarrowBooks = " + expectedBarrowBooks);
        Assert.assertTrue(actualBarrowedBook.equals(expectedBarrowBooks));
    }
    

}
