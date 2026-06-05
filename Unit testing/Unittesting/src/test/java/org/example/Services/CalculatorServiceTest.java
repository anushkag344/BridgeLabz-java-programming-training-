//package org.example.Services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    // JUnit 4
//    @BeforeClass
//    public static void init() {
//        System.out.println("Before all testcases:");
//        System.out.println("Started test: " + new Date());
//    }
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test cases");
//    }
//
//    @Test
//    public void testAddTwoNumbers() {
//        int result = CalculatorServices.addTwoNumbers(12, 45);
//        int expected = 57;
//
//        Assert.assertEquals(expected, result);
//    }
//
//    @Test
//    public void sumTwoNumbersTest() {
//        int result = CalculatorServices.sumTwoNumbers(2, 6, 7, 8);
//        int expected = 23;
//
//        Assert.assertEquals(expected, result);
//    }
//    @After
//    public void Aftereach(){
//        System.out.println("After all the test cases");
//
//    }
//
//    @AfterClass
//    public static void cleanUp() {
//        System.out.println("After all test cases:");
//        System.out.println("End cases: " + new Date());
//    }
//}