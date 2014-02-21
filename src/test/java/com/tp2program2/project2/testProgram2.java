/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2program2.project2;

import com.tp2program2.project2.service.Program2Service;
import com.tp2program2.project2.service.Program2ServiceImpl;
import org.junit.Ignore;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class testProgram2 {
    
    public static Program2Service service;
    public Integer num1;
    public Integer num2;
    public testProgram2() {
        
        num1 = 5;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void add() 
    {
        Assert.assertEquals(service.add(7,3),10);
    }
    
    @Test
    public void checkTrue() 
    {
        Assert.assertTrue(service.checkTrue(false));
    }
    
    @Test
    public void checkFalse() 
    {
        Assert.assertTrue(service.checkFalse(true));
    }
    
    @Test
    public void notNull() 
    {
        Assert.assertNotNull(num1);
    }
    
    @Test
    public void isNull() 
    {
        Assert.assertNotNull(num2);
    }
    
    @Test
    public void isSame() 
    {
        Assert.assertSame(true, service.isSame(9,9));
        Assert.assertNotSame(true, service.isSame(9,7));
    }
   
    
    @Ignore
    public void assertMessage()
    {
        Assert.assertEquals(service.assertMessage("Hi","How are you?"),false, "Returned as false");
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
        
        service = new Program2ServiceImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
