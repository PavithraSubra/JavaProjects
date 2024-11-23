import java.util.Scanner;

public class CompareNumsDigits {
    
   
public static void main(String args[] ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int num2 = scanner.nextInt();
    int tempnum, tempnum2, temp=0,numsum=0, num2sum=0;
    int resultnum=0;
    tempnum = num;
    tempnum2 = num2;
    while(num!=0)
    {        
        temp = num % 10;       
        num = num /10;
        numsum += temp;
    }
    while(num2!=0)
    {
        temp = num2 % 10;       
        num2= num2 /10;
        num2sum += temp;
    }
    if (numsum > num2sum)
    {

        resultnum = tempnum;
    }
    else if (num2sum > numsum)
    {

        resultnum = tempnum2;
    }
    else if(numsum == num2sum){
        resultnum = 0;
    }
    if(resultnum == 0)
    {
        System.out.println("Equal");
    }
    else{
        System.out.println(resultnum);
    }    
    scanner.close();
}

}
