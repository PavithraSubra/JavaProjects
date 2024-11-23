import java.util.Scanner;

public class printStringCount {

    
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String st = "";
        st = sc.nextLine();
        int count = sc.nextInt();
       
        for (int i=0; i < count; i++)
        {
            System.out.print(st);	
        }
        sc.close();

    }

}
