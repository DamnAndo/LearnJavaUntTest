package nandosan.tekno.testing;

import nandosan.tekno.testing.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Test For Calculator")
@DisplayNameGeneration(value= SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private CalculatorApp calculatorApp = new CalculatorApp();

    @Test
//    @DisplayName("Test Calculator Jika Sukses")
    public void testSuccessApp(){
        Integer result = calculatorApp.add(10,20);
        assertEquals(30,result);
    }

    @Test
    public void  testDevideSuccess(){
        Integer result = calculatorApp.devide(100,10);
        assertEquals(10,result);
    }

    @Test
    public void testDevideError(){
//        Integer result = calculatorApp.devide(100,10);
        assertThrows(IllegalArgumentException.class,()->{
            calculatorApp.devide(100,0);
        });
    }


}
