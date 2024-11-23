/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (isInteger(input))
        {
            System.out.println("This input is of type integer");
           
        }
        else if (isFloat(input))
        {
            System.out.println("This input is of type float");
        }
        
        else
        {
            
            System.out.println("This is something else");
        }
        scanner.close();
   }
   private static boolean NOT(boolean hasNextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NOT'");
    }
private static boolean isInteger(String input)
   {
       try 
       {
           Integer.parseInt(input);
           return true;
       }
       catch (Exception e)
       {
           return false;
       }
   }
   private static boolean isFloat(String input)
   {
       try 
       {
           Float.parseFloat(input);
           return true;
       }
       catch (Exception e)
       {
           return false;
       }
   }
  
  
}
