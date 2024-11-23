import java.util.Scanner;

public class DigitPlay {


    
   
public static void main(String args[] ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int odd=0, oddsum=0;
    int even=0, evensum=0;
    int result=0;
    while(num!=0)
    {
        int temp = num % 10;
        if(temp % 2 == 0) 
        {
            even = temp;       
            evensum += even;   
        }
        else if(temp % 2 != 0)
        {            
            odd = temp;    
            oddsum += odd;      
        }
        num = num /10;
    }
    if (evensum > oddsum)
    {
        result = evensum - oddsum;
    }
    else{
        result =  oddsum - evensum;
    }
    System.out.println(result);
    scanner.close();
}

}
