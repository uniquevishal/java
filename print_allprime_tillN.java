/* https://www.pepcoding.com/resources/online-java-foundation/getting-started/print-all-primes-till-n-official/ojquestion */
import java.util.*;

public class Main{
    public static void main(String[] args) {
 
     Scanner scn=new Scanner(System.in);
     int low=scn.nextInt();
     int high=scn.nextInt();
     while(low<=high){
         boolean isprime=true;
         
         for(int div=2;div*div<=low;div++){
             int r=low%div;
             if(r==0){
                 isprime=false;
                 break;
             }
         }
         if(isprime==true){
            System.out.println(low);
         }
         low++;
     }


    }
}
