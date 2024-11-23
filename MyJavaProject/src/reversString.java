public class reversString {

    public static void main(String args[] ) throws Exception {
    
      /*  String s = "Geeksforgeeks";
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        System.out.println(str);
    */
    /*
    String str="geeks";
    char ch;
    String st="";
    
    for(int i=0; i<str.length(); i++)
    {
        ch = str.charAt(i);
        st = ch + st;
    }
    System.out.println(st);*/

    String str="geeks";
    String st="";
        
    for(int  i= (str.length())-1;i>=0; i--)
    {
        st += str.charAt(i);
    }
    System.out.println(st);
    }

}
