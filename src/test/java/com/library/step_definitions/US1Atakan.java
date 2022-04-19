package com.library.step_definitions;


import com.library.pages.US1;
import com.library.utility.ConfigurationReader;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;
import java.util.List;

public class US1Atakan {



 //   @Given("Establish the database connection")
 //   public void establish_the_database_connection() {
//        DB_Util.createConnectionLibrary();
 //   }

    int totalUserID=0;
    int expectedUniqueUsersID=0;
    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_ids_from_users(){
     DB_Util.runQuery(US1.totalIDs);
     totalUserID=DB_Util.getRowCount();
    }
    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {
        DB_Util.runQuery(US1.uniqueID);
        expectedUniqueUsersID=DB_Util.getRowCount();
        Assert.assertTrue(expectedUniqueUsersID==totalUserID);
        System.out.println("totalUserID = "+totalUserID+ " expectedUniqueUsersID = " + expectedUniqueUsersID );
    }


    List<String>expectedList;
    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
     DB_Util.runQuery(US1.allColumns);
     expectedList=DB_Util.getAllColumnNamesAsList();
    }
    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(List<String>actualList) {
        Assert.assertEquals(expectedList,actualList);
        System.out.println("expected list "+expectedList+"\nactual list "+actualList);

    }

}
