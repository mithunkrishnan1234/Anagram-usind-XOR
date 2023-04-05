import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
      
            String c,d;
            c= a.toLowerCase();
            d= b.toLowerCase();
            char[] charArray1 = c.toCharArray();
            char[] charArray2= d.toCharArray();
            if(c.length()!=d.length()){
            return false;
        }
            int xor = 0;
         
         for (int i = 0; i < c.length(); i++)
         {
             xor ^= c.charAt(i) ^ d.charAt(i);
         }

         if(xor == 0){return true;}
         else{ return false;}
        }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
