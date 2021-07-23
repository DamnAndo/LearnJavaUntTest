package nandosan.tekno.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;


public class RandomCalculatorTest extends ParentCalculatorTest {

    @Test
    void testRandom(Random random){
        int a = random.nextInt();
        int b = random.nextInt();

        int result = calculator.add(a,b);
        int expected = a + b;

        Assertions.assertEquals(expected,result);

    }
}
