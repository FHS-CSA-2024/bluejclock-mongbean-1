package src.main.java;


public class ClockDisplay12Hour
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;
    
    public ClockDisplay12Hour(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplay12Hour(int hour, int minute,int ap){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute,ap);
    }
    
    public void timeTick(){
        System.out.println(hours.getValue() + ":" + minutes.getValue());
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
        }
        System.out.println(hours.getValue() + ":" + minutes.getValue());
        updateDisplay();
        
    }
    
    public void setTime(int hour,int minute, int ap){
        if ((hour == 12) && (ap == 1)){
            hours.setValue(hour);
        }
        else{
            hours.setValue(hour + 12*ap);
        }
        minutes.setValue(minute);
        updateDisplay();
    }
    
    public String getTime(){
        return display;
    }
    
    public void updateDisplay(){
        if (hours.getValue() == 0){
            display = "12:" + minutes.getDisplayValue() + "AM";
        } else if (hours.getValue() == 12){
            display = "12:" + minutes.getDisplayValue() + "PM";
        }
        else if (hours.getValue() > 12){
            display = hours.displayValue(hours.getValue()-12) + ":" + minutes.getDisplayValue() + "PM";
            
        }
        else{
            display = hours.getDisplayValue() +":" +  minutes.getDisplayValue() + "AM";
        }
        
    }
}
