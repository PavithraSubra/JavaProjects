import java.util.Scanner;

public class FindCharInString {

    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int found = 0;
        str = str.toString();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == c)
            {
                found=1;
            }
        }
        if(found == 1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        sc.close();
    }
}
