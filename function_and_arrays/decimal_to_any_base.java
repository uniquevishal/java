/* https://nados.io/question/decimal-to-any-base */
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int dp=1; //dp represent digit power at satarting 10 to power zero
       int rn=0; //first we have to declare required number to 0.so we make the required convert number
       while(n!=0){ //we run this loop till n is not equal to xero
       //first we find the modulo of the number
       int r=n%b;
       //now we add in required number according to our need;
        rn=rn+r*dp;
        n=n/b;
        dp*=10;
        }
        return rn;
   }
  }
