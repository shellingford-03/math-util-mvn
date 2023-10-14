/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanhin.mathutil.core;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author TANHIN
 */
public class MathUtilityDDTest {
    

    //chuẩn bị bộ data sẽ fill vào
    //hàm 2 chiều trả về để ss
    public static Object[][] initData() {
//        int[] a = {5, 10, 15, 20, 25};
        Object[][] testData =  {{0, 1}, 
                                {1, 1}, 
                                {3, 6}, 
                                {4, 24}, 
                                {5, 120}
                               };

        return testData;
    }
    
    
    // fill data vào hàm kiểm thử
    @ParameterizedTest
    @MethodSource("initData")
    public void verifiFactorialGivenRightArgumentReturnsOk(int n, long expected) {
         assertEquals(expected, MathUtility.getFactorial(n));
    }

}
