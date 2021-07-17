package nandosan.tekno.testing;

public class CalculatorApp {
	
	/*
	 * Coba Test Comment Git Eclipse
	 */

    public Integer add(Integer first, Integer second){
        return first + second;
    }

    public Integer devide(Integer first,Integer second){
        if(second == 0){
            throw new IllegalArgumentException("Cannot devide by zero");
        }else{
            return first / second;
        }
    }
}
