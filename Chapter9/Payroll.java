public class Payroll
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = ;    
    //Error detected at semicolon
    double payRate     = 10.0, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}