package nandosan.tekno.testing;

public class CalculatorApp {

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
