/* https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-4-official/ojquestion */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
      //taking input from user
      
      int n=scn.nextInt();
      int nsp=0;
      int nst=n;
     
      //one loop for printing nth rows
      
      for(int i=1;i<=n;i++){
        
      //one loop for printing spaces
      
      for(int j=1;j<=nsp;j++){
          System.out.print(" \t");
      }
      
      //one loop for printing stars
      
      for(int j=1;j<=nst;j++){
          System.out.print("* \t");
      }
      
      
      //updation of stars and spaces
      
      nst--;
      nsp++;
      System.out.println();
      
}
    }
}
