import org.junit.Assert;
import org.junit.Test;
import pl.camp.it.junit.Calculator;

public class CalculatorTest {

    @Test
    public void sumPositiveTest() {
        /************ Przygotowanie danych i scenariusza testowego *********/
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 6;
        int expectedResult = 11;

        /********************* Wykonanie testu *******************/

        int result = calculator.sum(a,b);

        /********************* Asercja **************************/

        Assert.assertEquals(expectedResult, result);
    }
}
