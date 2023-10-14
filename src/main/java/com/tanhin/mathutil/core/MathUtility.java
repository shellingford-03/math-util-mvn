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
//        public static final double PI = 3.1415;
//        
//        
//        //ham tinh n! = 1.2.3.4.5.6....
//        //n < 0 ; n>20 ko tinh dc vi 21! tran kieu long
//        //0! = 1! = 1
//        
//        public static long getFactorial(int n){
//            long result = 1;
//                    
//            if (n <0 || n >20)
//                throw new IllegalArgumentException("error");
//            
//            if(n==0 || n==1) 
//                return 1;
//            
//            for (int i = 2; i <= n; i++) 
//                result *= i;
//            
//            return result;
//            
//        }

    //NÂNG CẤP HÀM TÍNH GIAI THỪA DÙNG THUẬT TOÁN ĐỆ QUY - RECURSION - gọi lại chính mình với 1 quy mô nhỏ hơn 

        //ham tinh n! = 1.2.3.4.5.6....
        //n < 0 ; n>20 ko tinh dc vi 21! tran kieu long
        //0! = 1! = 1
        public static long getFactorial(int n) {

            if (n < 0 || n > 20) {
                throw new IllegalArgumentException("error");
            }

            if (n == 0 || n == 1) {
                return 1;
            }

            return n*getFactorial(n-1); 

        }
        
        // câu chuyện: ae fix bug tối ưu code, việc này đúng hay sai
        // leader chỉ cần nhìn màu xanh, ko care chi tiết 
        // đã xanh, test lại để vẫn xanh, mà ko cần nhìn chi tiết, ngta gọi là regression test - test hồi quy
        
        

    }
