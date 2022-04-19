package com.library.step_definitions;

import com.library.pages.US3;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US3Atakan {

    @When("I execute a query to find the most popular book genre")
    public void i_execute_a_query_to_find_the_most_popular_book_genre() {

        DB_Util.runQuery(US3.populerGenre);
    }

    @Then("verify that {string} is the most popular book genre.")
    public void verify_that_is_the_most_popular_book_genre(String mostPopular) {
        String actualPopular=DB_Util.getFirstRowFirstColumn();
        System.out.println("actualPopular = " + actualPopular +" Expected Popular = "+mostPopular);
        Assert.assertTrue(mostPopular.equals(actualPopular));
    }

}
