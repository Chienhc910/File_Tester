/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class TestDate {
    
    public TestDate() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void testDaysInMonthReturn31() {
//        int[] month = {1, 3, 5, 7, 8, 10, 12};
//        int year = 1600;
//        int expected = 31;
//        for (int i = 0; i < month.length; i++) {
//            int actual = checkdate.CheckDate.dayInMonth(month[i], year);
//            assertEquals(expected, actual);
//        }
//    }
    
    @Test
    public void testDayInMonth(){ 
       assertEquals(29, checkdate.CheckDate.dayInMonth(2, 2016)); 
       assertEquals(29, checkdate.CheckDate.dayInMonth(2, 1600)); 
}
}
