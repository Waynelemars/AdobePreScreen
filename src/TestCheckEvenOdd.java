import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCheckEvenOdd {
    
    CheckEvenOdd _checkEvenOdd = new CheckEvenOdd();
    
    @Test
    public void testEven() {
        
        boolean result1 = _checkEvenOdd.isEven(4);
        boolean expected1 = true;
        boolean result2 = _checkEvenOdd.isEven(843);
        boolean expected2 = false;
        boolean result3 = _checkEvenOdd.isEven(-1);
        boolean expected3 = false;
        boolean result4 = _checkEvenOdd.isEven(0);
        boolean expected4 = true;
        
        assertEquals(expected1, result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
        assertEquals(expected4,result4);
        
    }
    @Test
    public void testDivisibleThree(){
        
        boolean result1 = _checkEvenOdd.isDivisiblebyThree(3);
        boolean expected1 = true;
        boolean result2 = _checkEvenOdd.isDivisiblebyThree(340231);
        boolean expected2 = false;
        boolean result3 = _checkEvenOdd.isDivisiblebyThree(6);
        boolean expected3 = true;
        assertEquals(expected1, result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
        
    }
    @Test
    public void testArray(){
        int[] a = {-3,2,5,1,3,0,1000};
        _checkEvenOdd.detectNumber(a);
    }
    
    
    
}
