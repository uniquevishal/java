/* https://nados.io/question/any-base-to-decimal */
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int bp=1; //b^0
      int rn=0;
      while(n>0){
         
         int r=n%10;
         n=n/10;
         rn=rn+bp*r;
         bp=bp*b;
      }
      return rn;
   }
  }
