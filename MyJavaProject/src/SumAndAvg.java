import java.util.Scanner;

public class SumAndAvg {

    
public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int arraylen = scanner.nextInt();
        int [] arrayElem = new int [arraylen];
        int sum =0;
        double avg =0;

        for (int i=0; i<arraylen ; i++)
        {
            arrayElem[i] = scanner.nextInt();
        }
        for (int j=0; j<arraylen ; j++)
        {
            sum += arrayElem[j];

        }
        avg = (double) sum/arraylen;
        String formattedString = String.format("%.02f", avg);
        System.out.println(sum +" "+ formattedString);
        //System.out.printf("%.2f", avg);
        scanner.close();


    }
}
