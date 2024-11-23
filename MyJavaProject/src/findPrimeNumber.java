import java.util.Scanner;

public class findPrimeNumber {

    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        for (int i = startRange; i <= endRange; i++) {
            if (findPrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
     //   System.out.println(flg);
        scanner.close();
   }
   private static boolean findPrimeNum( int n)
   {
    
    if (n == 0 || n == 1) {
        return false;
    }
    // 2 is a prime number
    if (n == 2) {
        return true;
    }
    // every composite number has a prime factor
    // less than or equal to its square root.
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }
   }

