/*  https://nados.io/question/pattern-5 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n=scn.nextInt();
        int nst=1;
        int nsp=n/2;
        
         
         
         //loop for printing nth rows
        
        for(int i=1;i<=n;i++){
        
        //one loop for space
        
        for(int j=1;j<=nsp;j++){
            System.out.print("\t");
        }
        
        //second loop for star
        
        for(int j=1;j<=nst;j++){
            System.out.print("*\t");
        }
        
          System.out.println();
        
        // condition for n/2 star are incresed and nsp decreases after that nsp inccreases and nst decreases
        
        if(i<=n/2){
            nsp--;
            nst+=2;
        }
        else{
            nsp++;
            nst-=2;
        }
       
        }
    }
}
