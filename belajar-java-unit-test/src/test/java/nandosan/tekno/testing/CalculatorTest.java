package nandosan.tekno.testing;

import nandosan.tekno.testing.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;

//@DisplayName("Test For Calculator")
@DisplayNameGeneration(value= SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private CalculatorApp calculatorApp = new CalculatorApp();
    
    @BeforeAll
    public static void beforeAll() {
    	System.out.println("Before All");
    }
    
    
    @BeforeEach
    public void setUp() {
    	System.out.println("Before Each");
    }
    
    @AfterEach
    public void tearDown() {
    	System.out.println("After Each");
    }

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
    
    
    @Test
    @Disabled
    public void commingSoon() {
    	
    }
    
    
    @AfterAll
    public static void afterAll() {
    	System.out.println("After All");
    }
    
    //membatalkan test
    @Test
    public void testAborted() {
    	String profile = System.getenv("PROFILE");
    	
    	if(!"DEV".equals(profile)) {
    		throw new TestAbortedException("Test ini di batalkan karena bukan DEV");
    	}
    }
    
    
    //menggunakan assumption -> bisa throw TestAbortedException
    @Test
    public void testAssumption() {
    	assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
    


}
