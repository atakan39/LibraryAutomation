package com.library.step_definitions;

import com.library.pages.US4;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4Atakan {
    String popularUser;
    @When("I execute a query to find the most popular user")
    public void i_execute_a_query_to_find_the_most_popular_user() {
        DB_Util.runQuery(US4.popularUser);
        popularUser=DB_Util.getFirstRowFirstColumn();
    }
    @Then("verify {string} is the user who reads the most")
    public void verify_is_the_user_who_reads_the_most(String expectedPopularUser) {

        Assert.assertTrue(popularUser.equals(expectedPopularUser));

    }

}
