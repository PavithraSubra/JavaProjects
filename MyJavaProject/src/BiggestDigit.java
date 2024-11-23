import java.util.Scanner;

public class BiggestDigit {


   
public static void main(String args[] ) throws Exception {

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int big=0;
    int small =9;
    while(num!=0)
    {
        int temp = num % 10;
        big = Math.max(temp, big);
        small = Math.min(temp, small);
        num = num /10;
    }
    System.out.println(big);
    scanner.close();
    
    }
}