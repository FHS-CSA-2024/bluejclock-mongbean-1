package src.main.java;



public class NumberDisplay
{
    //implement 2 private variables, limit and value.
    //  both should be ints
    private int limit;
    private int value;
    //implement a constructor that sets the limit to a passed in variable rollOverLimit
    //  should set value to 0
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }
    
    //Implement getter/setter methods for limit and value
    //  The setValue method should check the input for validity
    //      (should not be less than 0, or over the limit)
    public int getLimit(){
        return limit;
    }
    public int getValue(){
        return value;
    }
    public void setLimit(int limit){
        this.limit = limit;
    }
    public void setValue(int value){
        if (value >= limit){
            this.value = 0;
        }else if (value <= 0){
            //not valid
        }
        else{
            this.value = value;
        }
    }
    
    //Implement a function getDisplayValue that take no parameters and returns a String.
    //  The return string should be formatted as a two digit number
    //  If the number is less than 10 it should return a 0 before the number.
    public String getDisplayValue(){
        return Integer.toString((value-value%10)/10) + value %10;
    }
    public String displayValue(int a){
        return Integer.toString((a-a%10)/10) + a %10;
    }

    //Implement a method increment that takes no parameters and returns nothing. 
    //  This function should increase value by 1, unless it reaches the limit.
    //  It should reset to 0 if the limit is reached
    public void increment(){
        value ++;
        
        if (value >= limit){
            value = 0;
            System.out.println(value);
        }
    }
}
