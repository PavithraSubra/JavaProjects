import java.util.Scanner;

public class GCDNumber {
    public static void main(String args[] ) throws Exception {


        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secNum = scanner.nextInt();
        int result =0;
        if(((firstNum > 1) && (secNum > 1)) &&
        (firstNum < (Math.pow(10,5))) &&
        (secNum < (Math.pow(10,5))) )
        {
             result = findGCD(firstNum, secNum);
        }

        System.out.println(result);
        scanner.close();

       
    }
    private static int findGCD(int firstNum, int secNum) {
        // Find Minimum of a and b
        int result = Math.min(firstNum, secNum);
        while (result > 0) {
            if (firstNum % result == 0 && secNum % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;

    }


}
