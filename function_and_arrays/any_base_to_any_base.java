/* https://nados.io/question/any-base-to-any-base?zen=true  */
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=get_the_number_in_AnyBase( n,sourceBase,destBase);
     System.out.println(ans);
   }   

   public static int get_the_number_in_AnyBase(int n,int b1,int b2){

  //b1 se dec
  int dec=getValueIndecimal(n,b1);
  //dec to b2
  int ans=getValueInBase(dec,b2);
  return ans;



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
