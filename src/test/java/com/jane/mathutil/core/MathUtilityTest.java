package com.jane.mathutil.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.jane.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author janet
 */
public class MathUtilityTest {
  
    //test case 01 verify getFactorial(with n=0)
    //Steps/Procedures
    //             1. Given n = 0;
    //             2. Call/invoke getFactorial(n=0)
    //expected result 
    //             the method must return 1 as the result of 0! = 1
    //status: PASSED | FAILED chờ lúc chạy hàm mới biết trạng thái 
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOK(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOK(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOK(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}




