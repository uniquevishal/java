/* https://www.pepcoding.com/resources/online-java-foundation/getting-started/is-number-prime-official/ojquestion */
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       int t=scn.nextInt();
       for(int i=1;i<=t;i++){
       
       int x=scn.nextInt();
       boolean isprime=true;

       int div=2;
       while(div*div<=x){
         int r=x%div;
         if(r==0){
           isprime=false;
           break;
         }
         div++;
       }
       if(isprime==true){
         System.out.println("prime");
       }
       else{
         System.out.println("not prime");
       }
       }
   }
  }
