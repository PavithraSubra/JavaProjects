import java.util.Scanner;

public class DataTypesPrint {

    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        long l = sc.nextLong();
        byte d = sc.nextByte();
      
        dataTypes(a, b, c, l, d);
        sc.close();
    }

    static void dataTypes(int a, float b, double c, long l, byte d){

        double p = c/b;//c/b
        double q = b/a ;//b/a
        double r = c/a ;//c/a
        double m =  r + l;//r+l
        int s = a/d;//a/d
        
        //Printing all the results 
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }

    
   
}
