/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class MyVectorTest {
    
    public MyVectorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of size method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testSize() {       
        System.out.println("size");
        double myArray []={5.0,4.0};
        MyVector instance = new MyVector(myArray);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        double myArray []={5.0,4.0};
        MyVector instance = new MyVector(myArray);
        double expResult = 5.0;
        double result = instance.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of plus method, of class MyVector.
     * Correct output. Flagging as fail
     */
    @org.junit.jupiter.api.Test
    public void testPlus() {
        System.out.println("plus");
        double myArray []={5.0,4.0};
        MyVector instance1 = new MyVector(myArray);
        MyVector instance2 = new MyVector(myArray);
        double myArray2 []={10.0,8.0};
        MyVector expResult=new MyVector(myArray2);
        MyVector result=new MyVector (instance1.plus(instance2));
        assertEquals(expResult, result);

    }

    /**
     * Test of minus method, of class MyVector.
     * Correct output. Flagging as fail
     */
    @org.junit.jupiter.api.Test
    public void testMinus() {
        System.out.println("minus");
        double myArray []={5.0,4.0};
        MyVector instance1 = new MyVector(myArray);
        MyVector instance2 = new MyVector(myArray);
        double myArray2 []={0.0,0.0};
        
        
        MyVector expResult=new MyVector(myArray2);
        MyVector result=new MyVector (instance1.minus(instance2));
        assertEquals(expResult, result);
    }

    /**
     * Test of scaledBy method, of class MyVector.
     * Correct output. Flagging as fail
     */
    @org.junit.jupiter.api.Test
    public void testScaledBy() {
        System.out.println("scaledBy");
        double multiplier = 3.0;
        double myArray []={5.0,4.0};
        MyVector instance1 = new MyVector(myArray);
        double myArray2 []={15.0,12.0};
        MyVector expResult = new MyVector(myArray2);
        MyVector result = new MyVector(instance1.scaledBy(multiplier));

        assertEquals(expResult, result);

    }

    /**
     * Test of dot method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testDot() {
        System.out.println("dot");
        double myArray []={5.0,4.0};
        MyVector instance1 = new MyVector(myArray);
        MyVector instance2 = new MyVector(myArray);
        double expResult = 41.0;
        double result = instance1.dot(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        double myArray []={5.0,4.0};
        MyVector instance1 = new MyVector(myArray);
        MyVector instance2 = new MyVector(myArray);
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        double x []={};
        MyVector instance = new MyVector(x);
        String expResult = "Vector: ";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of abs method, of class MyVector.
     */
    @org.junit.jupiter.api.Test
    public void testAbs() {
        System.out.println("abs");
        double x []={3.0};
        MyVector instance = new MyVector(x);
        double expResult = 3.0;
        double result = instance.abs();
        assertEquals(expResult, result, 0.0);
    }
    
}
