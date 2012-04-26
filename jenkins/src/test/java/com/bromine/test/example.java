package com.bromine.test;

import org.testng.annotations.*;
 
public class example {
    @BeforeGroups
    public void BeforeGroups() {
        System.out.println("@BeforeGroups");
    }
 
    @BeforeClass
    public void BeforeClass() {
        System.out.println("@BeforeClass");
    }
 
    @Test(groups = {"My group"})
    public void test1() {
        System.out.println("test1");
    }
 
    @Test
    public void test2() {
        System.out.println("test2");
    }
 
    @AfterClass
    public void AfterClass() {
        System.out.println("@AfterClass");
    }
 
    @AfterMethod
    public void AfterMethod() {
        System.out.println("@AfterMethod");
    }
}