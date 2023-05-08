package com.automation.runner;

import com.automation.categories.EmilyTest;
import com.automation.categories.MustafaTest;
import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import com.automation.test.CartPageTest;
import com.automation.test.LoginTest;
import com.automation.test.SearchFunctionalityTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({CartPageTest.class, LoginTest.class, SearchFunctionalityTest.class})
@Categories.IncludeCategory(RegressionTest.class)
public class GroupRunner {
}
