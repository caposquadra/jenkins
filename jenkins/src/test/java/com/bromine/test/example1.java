package com.bromine.test;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

public class example1 extends Assert {
	 
    @Test(expectedExceptions = NullPointerException.class)
    public void testNullPointerException() {
        List list = null;
        int size = list.size();
    }
}