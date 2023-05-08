package com.automation.test;

import com.automation.categories.EmilyTest;
import com.automation.categories.MustafaTest;
import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CartPageTest extends BaseTest{

    @Test
    @Category({RegressionTest.class, SmokeTest.class, MustafaTest.class})
    public  void  verifyUserCanAddProductToCart(){
        System.out.println("verify user can add item");
    }
    @Test
    @Category({RegressionTest.class, MustafaTest.class})
    public  void  verifyUserCanRemoveProductFromCart(){
        System.out.println("verify user can remove item");
    }
    @Test
    @Category({RegressionTest.class, EmilyTest.class})
    public  void  verifyUserCanChangeQuantityOfItem(){
        System.out.println("verify user can change quantity of item");
    }
}
