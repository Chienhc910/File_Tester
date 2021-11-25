/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.CheckDate;
import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException;
import javax.crypto.IllegalBlockSizeException;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {

    @Test
    public void UTCID01() {
        assertEquals(true, CheckDate.CheckDate("29", "2", "2000"));

    }
     @Test
    public void UTCID02() {
        assertEquals(false, CheckDate.CheckDate("29", "2", "2009"));

    }
     @Test
    public void UTCID03() {
        assertEquals(false, CheckDate.CheckDate("31", "2", "2020"));

    }
    @Test
    public void UTCID04() {
        assertEquals(true, CheckDate.CheckDate("30", "4", "2016"));

    }
    
//    @Test (expected = IllegalArgumentException.class)
//    public void UTCID04A() {
//        CheckDate.CheckDate("one", "4", "2020");
//
//    }
    @Test
    public void UTCID05() {
        assertEquals(false, CheckDate.CheckDate("29", "2", "2015"));

    }
    

    @Test(expected = NullPointerException.class)
    public void UTCID06() {
         CheckDate.CheckDate("", "3", "2000");

   }
    @Test
    public void UTCD07(){
        assertEquals(false, CheckDate.CheckDate("0", "4", "2009"));
        
    }

    @Test
    public void UTCID08() {
        assertEquals(false, CheckDate.CheckDate("31", "4", "2009"));

    }
    @Test
    public void UTCID09() {
        assertEquals(true, CheckDate.CheckDate("30", "4", "2009"));

    }
    @Test
    public void UTCID10() {
        assertEquals(true, CheckDate.CheckDate("28", "2", "2009"));

    }
    @Test
    public void UTCID11() {
        assertEquals(true, CheckDate.CheckDate("28", "2", "2021"));

    }
     @Test
    public void UTCID12() {
        assertEquals(true, CheckDate.CheckDate("28", "2", "2018"));

    }
     @Test
    public void UTCID13() {
        assertEquals(true, CheckDate.CheckDate("29", "2", "2004"));

    }
     
    @Test
    public void UTCID15() {
        assertEquals(true, CheckDate.CheckDate("30", "4", "2021"));

    }
}
