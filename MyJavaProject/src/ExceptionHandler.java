import java.util.Scanner;

public class ExceptionHandler {

    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        
            while( scan.hasNextInt()){
            int n = scan.nextInt();
            int p = scan.nextInt();
            try{ 
                if (( n > 1) && (p > 1))
                {
                    int result = (int) Math.pow(n, p);
                    System.out.println(result);
                }
                else if( n==0 || p == 0)
                {
                    throw new Exception ("n and p should not be zero");
                }
                else if( n<0 || p <0){
                    throw new Exception ("n and p should not be negative");

                }
            } 
            catch(Exception e){ 
               // System.out.println(e + "n and p should not be zero."); 
               System.out.println(e);
            }
                
        }
        scan.close();
    }

}
