/* https://www.pepcoding.com/resources/online-java-foundation/getting-started/prime-factorization-official/ojquestion  */
import java.util.*;

public class Main{

public static void main(String[] args) {
  //take a number by user
  //make a for loop starting factor from 2 and go till root of n
  //in for loop body make a while loop till n%f=0
  //now n not become 1 special case for prime number ex-46
  
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  
  for(int f=2;f*f<=n;f++){
      while(n%f==0){
          
          System.out.print(f+" ");
          n=n/f;
          
          
      }
  }
  if(n>1){
      System.out.println(n);
  }
  
  
  
  
 }
}
