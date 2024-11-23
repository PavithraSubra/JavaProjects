import java.util.Scanner;

public class findFactorial {


    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);

        
        int number = scanner.nextInt();

        int result = findFact(number);

        System.out.println(result);
        scanner.close();
    }
    
    private static int findFact(int number) {

        int factResult =1;
     
        for(int i = 1; i<=number; i++)
        {
            factResult = factResult * i;
      
        }
    
        return factResult;
        // TODO Auto-generated method stub

    }

}
