
/**
 * Write a description of class PayDay here.
 *
 * Michael Doll
 * 10.18.2019
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    private String name; 
    private double hours;
    private double payRate; 
    private double deductions; 
    
    

    /**
     * Constructor for objects of class PayDay
     */
    public PayDay(String name, double hours, double payRate, double deductions)
    {
        // initialise instance variables
        this.name = name;
        this.hours = hours;
        this.payRate = payRate; 
        this.deductions = deductions; 
        
      
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */



public String printPay(String name, double hours, double payRate, double deductions){
    double pay = hours*payRate; 
    double ded = deductions * pay; 
    double total = pay - ded;
    return name + " " +String.format("%.2f",(pay)) + " " +String.format("%.2f",(ded)) + " " +String.format("%.2f",(total));
}
}