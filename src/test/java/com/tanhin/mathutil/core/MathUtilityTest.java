/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanhin.mathutil.core;

import static com.tanhin.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author TANHIN
 */
public class MathUtilityTest {
    @Test
    public void testFactorial(){
         //TEST CASE 1: CHECK IF getfactorial run well with n=0
        
        //Test Procedures/Steps:
        //          given n = 3;
        //          invoke getFactorial(n=3)
        
        //expected result = 6
        
        long expected = 6 ;     
        int n = 3;              
        
        assertEquals(expected,getFactorial(n));
        
        
        
    }
}
