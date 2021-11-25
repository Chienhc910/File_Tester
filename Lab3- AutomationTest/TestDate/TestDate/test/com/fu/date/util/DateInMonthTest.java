/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.DateInMonth;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 *
 * @author DELL
 */
public class DateInMonthTest {
    
    
  
    @Test
    public void UTCID01(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(1, 2020));
       
    }
    @Test
    public void UTCID02(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(3, 2022));
       
    }
    @Test
    public void UTCID03(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(5, 2022));
       
    }
    @Test
    public void UTCID04(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(7, 2022));
       
    }
    @Test
    public void UTCID05(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(8, 2019));
       
    }
    @Test
    public void UTCID06(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(10, 2019));
       
    }
    @Test
    public void UTCID07(){
      
        assertEquals(31, DateInMonth.checkDateInMonth(12, 2019));
       
    }
    @Test
    public void UTCID08(){
      
        assertEquals(30, DateInMonth.checkDateInMonth(4, 2021));
       
    }
    @Test
    public void UTCID09(){
      
        assertEquals(30, DateInMonth.checkDateInMonth(6, 2021));
       
    }
    @Test
    public void UTCID10(){
      
        assertEquals(30, DateInMonth.checkDateInMonth(9, 2021));
       
    }
    @Test
    public void UTCID11(){
      
        assertEquals(30, DateInMonth.checkDateInMonth(11, 2021));
       
    }
     @Test
    public void UTCID12(){
      
        assertEquals(29, DateInMonth.checkDateInMonth(2, 2020));
       
    }
     @Test
      public void UTCID13(){
      
        assertEquals(28, DateInMonth.checkDateInMonth(2, 2021));
       
    }
       @Test(expected = IllegalArgumentException.class)
      public void UTCID14(){
      
        DateInMonth.checkDateInMonth(13, 10);
       
    }
     @Test(expected = IllegalArgumentException.class)
     public void UTCID15(){
      
       DateInMonth.checkDateInMonth(0, 2020);
       
    }
//     @Test
//        (expected = IllegalArgumentException.class)
//     public void UTCID14B(){
//      
//       DateInMonth.checkDateInMonth(1, 10);
//       
//    }
     
}
