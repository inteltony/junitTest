package com.junitTest.app1.junitTest1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junitTest.app1.junitTest1.App;

/**
 * Unit test for simple App.
 */

public class AppTest 
    
{
   
    @Test
    public void TestRun()
    {   App testApp = new App();
       String a = testApp.sample("TEST1");
       assertEquals("Test1:","TEST1",a);
       System.out.println(a);
    }

   
}
