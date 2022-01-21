/* https://www.pepcoding.com/resources/online-java-foundation/getting-started/reverse-a-number-official/ojquestion    */
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     //only a single loop required for counting
     
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     
     
     while(n!=0){
         int q=n/10;
         int r=n%10;
         
        System.out.println(r);
        n=q;
     }
     
     
    }
   }
