import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PrintDataTypes {

    public static void main(String args[] ) throws Exception {

    //Write code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = scan.nextInt();
        float numfloat = scan.nextFloat();
        DecimalFormat df = new DecimalFormat("#.#");
        String formattedNum = df.format(numfloat);

        System.out.println(str);
        System.out.println(num);
        System.out.println(formattedNum);

        scan.close();
    }
    

}
