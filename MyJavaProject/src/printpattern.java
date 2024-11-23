public class printpattern {

    public static void main(String[] args) {
        int num = 5;
        printPattern(num);

    }
    private static void printPattern(int num)
   {
       for(int i=0; i<num ; i++)
       {
           for(int j=0; j<num; j++)
           {
                if (j<num-1)
                {
                    System.out.print("* ");
                }
                else if(j== num-1)
                {
                    System.out.print("*");
                }
                
                
           }
           if(i < num-1)
           {
               System.out.println();
           }
           
       }
   }

}
