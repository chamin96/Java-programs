import java.io.*;
import java.util.*;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Solution {

   public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner keyboard = new Scanner(System.in);
       
       long w;
       int x,y;

       w = keyboard.nextLong();
       x = keyboard.nextInt();
       y = keyboard.nextInt();

        ArrayList<Long> setKey= new ArrayList<Long>();
        ArrayList<Long> setMice= new ArrayList<Long>();

       for (int i = 0; i < x; i++) {
            long val = keyboard.nextLong();
            if (val>w) {
                continue;
            }
            else{
                setKey.add(val);
            } 
       }

       for (int i = 0; i < y; i++) {
            long val = keyboard.nextLong();
            if (val>w) {
                continue;
            }
            else{
                setMice.add(val);
            }
       }

       Collections.sort(setKey);
       Collections.sort(setMice,Collections.reverseOrder());

       long temp=0;
       long out=0;
       long k=0;
       for(long q:setKey){
           k++;
           for(long r:setMice){
               if (q+r>w) {
                   continue;
               }
               else{
                    temp=q+r;
                    if (temp>=out) {
                        out=temp;
                    }
               }
           }
           
       }
       System.out.println(out);
       
       
       keyboard.close();
   }
}