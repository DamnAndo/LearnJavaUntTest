package nandosan.tekno.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class ParentCalculatorTest {

    protected CalculatorApp calculator = new CalculatorApp();

    @BeforeEach
    public void setUp(){
        System.out.println("Set up");
    }
}
