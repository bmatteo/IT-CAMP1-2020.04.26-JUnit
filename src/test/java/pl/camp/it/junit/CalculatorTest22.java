package pl.camp.it.junit;

import org.junit.*;

public class CalculatorTest22 {

    private static Calculator calculator;

    public CalculatorTest22() {
        System.out.println("Konstruktor !!");
    }

    @Before
    public void dataPrepare() {
        System.out.println("Before !!");
    }

    @After
    public void cleanDB() {
        System.out.println("After !!");
    }

    @BeforeClass
    public static void prepareDataFoAllTests() {
        System.out.println("Before class !!");
        CalculatorTest22.calculator = new Calculator();
    }

    @AfterClass
    public static void cleanDataAfterTest() {
        System.out.println("After class !!");
    }

    @Test
    public void sumPositiveTest() {
        /************ Przygotowanie danych i scenariusza testowego *********/
        int a = 5;
        int b = 6;
        int expectedResult = 11;

        /********************* Wykonanie testu *******************/

        int result = calculator.sum(a,b);

        /********************* Asercja **************************/

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void sumPositiveAndNegativeTest() {
        /************ Przygotowanie danych i scenariusza testowego *********/
        int a = 5;
        int b = -1;
        int expectedResult = 4;

        /********************* Wykonanie testu *******************/

        int result = calculator.sum(a,b);

        /********************* Asercja **************************/

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void sumZeroAndNegativeTest() {
        int a = 0;
        int b = -1;
        int expectedResult = -1;

        int result = calculator.sum(a,b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {
        int a = -4;
        int b = -1;
        int expectedResult = 4;

        int result = calculator.multiply(a,b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void dividePositiveTest() {
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test(expected = DivideByZeroException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
    }
}
