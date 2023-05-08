package com.automation.test;

import com.automation.categories.EmilyTest;
import com.automation.categories.MustafaTest;
import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;

public class SearchFunctionalityTest extends BaseTest{
    @Test
    @Category({RegressionTest.class, SmokeTest.class, MustafaTest.class})
    public  void  verifySearchResultsAreDisplayed(){
        System.out.println("verify search result");
    }
    @Test
    @Category({RegressionTest.class, MustafaTest.class})
    public  void  verifyMessageWhenThereAreNoResult(){
        System.out.println("verify no result message");
    }
    @Test
    @Category({RegressionTest.class, EmilyTest.class})
    public  void  verifySearchResultHasSearchKeyword(){
        System.out.println("verify search result has search keyword");
    }
}
