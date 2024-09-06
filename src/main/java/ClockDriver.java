package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("Testing: ClockDisplay");
        ClockDisplay test1 = new ClockDisplay();
        System.out.println("\tgetTime " + test1.getTime());
        ClockDisplay test2 = new ClockDisplay(2,45);
        System.out.println("\tgetTime non-empty " + test2.getTime());
        test2.setTime(5,15);
        System.out.println("\tsetTime " + test2.getTime());
        
        ClockDisplay tickTime1 = new ClockDisplay(3,32);
        tickTime1.timeTick();
        System.out.println("\ttickTest1 " + tickTime1.getTime());
        
        ClockDisplay tickTime2 = new ClockDisplay(3,9);
        tickTime2.timeTick();
        System.out.println("\ttickTest2 " + tickTime2.getTime());
        
        ClockDisplay tickTime3 = new ClockDisplay(1,59);
        tickTime3.timeTick();
        System.out.println("\ttickTest3 " + tickTime3.getTime());
        
        ClockDisplay tickTime4 = new ClockDisplay(9,59);
        tickTime4.timeTick();
        System.out.println("\ttickTest4 " + tickTime4.getTime());
        
        ClockDisplay tickTime5 = new ClockDisplay(23,59);
        tickTime5.timeTick();
        System.out.println("\ttickTest5 " + tickTime5.getTime());
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        System.out.println("Testing: ClockDisplaySeconds");
        ClockDisplaySeconds stest1 = new ClockDisplaySeconds();
        System.out.println("\tgetTime " + stest1.getTime());
        ClockDisplaySeconds stest2 = new ClockDisplaySeconds(2,45,30);
        System.out.println("\tgetTime non-empty " + stest2.getTime());
        stest2.setTime(5,15,34);
        System.out.println("\tsetTime " + stest2.getTime());
        
        ClockDisplaySeconds stickTime1 = new ClockDisplaySeconds(3,32,59);
        stickTime1.timeTick();
        System.out.println("\ttickTest1 " + stickTime1.getTime());
        
        ClockDisplaySeconds stickTime2 = new ClockDisplaySeconds(1,0, 59);
        stickTime2.timeTick();
        System.out.println("\ttickTest2 " + stickTime2.getTime());
        
        ClockDisplaySeconds stickTime3 = new ClockDisplaySeconds(1,59,59);
        stickTime3.timeTick();
        System.out.println("\ttickTest3 " + stickTime3.getTime());
        
        ClockDisplaySeconds stickTime4 = new ClockDisplaySeconds(23,59,59);
        stickTime4.timeTick();
        System.out.println("\ttickTest4 " + stickTime4.getTime());
        
        
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        System.out.println("Testing: ClockDisplay12Hour");
        ClockDisplay12Hour htest1 = new ClockDisplay12Hour();
        System.out.println("\tgetTime " + htest1.getTime());
        ClockDisplay12Hour htest2 = new ClockDisplay12Hour(2,45,0);
        System.out.println("\tgetTime non-empty " + htest2.getTime());
        htest2.setTime(5,15,1);
        System.out.println("\tsetTime " + htest2.getTime());
        
        ClockDisplay12Hour htickTime1 = new ClockDisplay12Hour(3,32,1);
        htickTime1.timeTick();
        System.out.println("\ttickTest1 " + htickTime1.getTime());
        
        ClockDisplay12Hour htickTime2 = new ClockDisplay12Hour(11,59, 1);
        htickTime2.timeTick();
        System.out.println("\ttickTest2 " + htickTime2.getTime());
        
        ClockDisplay12Hour htickTime3 = new ClockDisplay12Hour(11,59,0);
        htickTime3.timeTick();
        System.out.println("\ttickTest3 " + htickTime3.getTime());
        
        ClockDisplay12Hour htickTime4 = new ClockDisplay12Hour(12,59,1);
        htickTime4.timeTick();
        System.out.println("\ttickTest4 " + htickTime4.getTime());
        
    }
}
