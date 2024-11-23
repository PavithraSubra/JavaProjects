import java.io.*;
import java.util.*;

public class simpleInterest {

    /* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        int interest = scanner.nextInt();
        int year = scanner.nextInt();

        int simpleInterest = calculateSimpleInterest( principal ,  interest, year);
        
        System.out.println(simpleInterest);
        scanner.close();
   }

    private static int calculateSimpleInterest(double principal, int interest, int year) {
        // TODO Auto-generated method stub
        if( ( principal > 1 && principal <= 1000  ) &&
            ( interest > 1 && interest <=1000 ) &&
            ( year > 1 && year <=1000 )
        )
        {
            double finalAmt ;
            finalAmt = (principal * interest * year)/100;
            int simpleInt = (int) finalAmt;

            return  simpleInt;
        }
        return year;

    }
}





