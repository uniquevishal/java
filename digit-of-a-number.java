 /* https://www.pepcoding.com/resources/online-java-foundation/getting-started/digits-of-a-number-official/ojquestion */
import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      //one loop for counting the divisor
      //second for printing the digit
      int div=1;
      int temp=n;
      while(temp>=10){
        temp=temp/10;
        div*=10;
      }
      
      
      while(div>=1){
        int q=n/div;
        
        int r=n%div;
        System.out.println(q);
        n=r;
        div=div/10;

      }



     }
    }
