/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanhin.mathutil.core;

/**
 *
 * @author TANHIN
 */
//day la bo thu vien chua cac ham dung trong tinh toan
//toan hoc, clone giong class Math ben JDK
// khi goi la thu vien ma ko can nho
//sau khi su li -> thu vien chua do STATIC




public class MathUtility {
        public static final double PI = 3.1415;
        
        
        //ham tinh n! = 1.2.3.4.5.6....
        //n < 0 ; n>20 ko tinh dc vi 21! tran kieu long
        //0! = 1! = 1
        
        public static long getFactorial(int n){
            long result = 10;
                    
            if (n <0 || n >20)
                throw new IllegalArgumentException("error");
            
            if(n==0 || n==1) 
                return 1;
            
            for (int i = 2; i <= n; i++) 
                result *= i;
            
            return result;
            
        }
}
