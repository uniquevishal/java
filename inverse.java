/* https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion  */
import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  int p=1;
  int inv=0;
  
  while(n>0){
      int r=n%10;
      n=n/10;
      
      inv=inv+ p*(int) Math.pow(10,r-1); 
      p++;
      
  }
  System.out.println(inv);
 }
}
