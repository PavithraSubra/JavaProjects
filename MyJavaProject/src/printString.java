import java.util.Scanner;

public class printString {

    public static void main(String args[] ) throws Exception {


     Scanner sc = new Scanner(System.in);

		    
		    // Your code here
		  /*  int a = sc.nextInt();
		    float b = sc.nextFloat();
		    long c = sc.nextLong();
		    byte d = sc.nextByte();

		    String s = sc.nextLine();
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(s);
			
			
		    String s = sc.nextLine();
			while(sc.hasNext()){
				s = sc.nextLine();
				System.out.println(s);
			}
			System.out.println(s);
		        */
				
			//	StringBuffer str = new StringBuffer(st);
		while(sc.hasNextLine())
				{
					String st = sc.nextLine();
					System.out.println(st);					
					
				}
		
					
        sc.close();

    }
}