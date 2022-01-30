/* https://nados.io/question/pattern-16 */
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

   // take the input from user in the form of n

     int n=scn.nextInt();

    // we find the nsp by the formula nsp=total number of column-star from first line
    //from last row it is clear that total number of column=n+(n-1)

     int nsp=2*n-3;
     int star=1;

     //this loop print the nth rows

     for(int i=1;i<=n;i++){

         //this loop will print the starting star

         for(int j=1;j<=star;j++){
             System.out.print(j+"\t");
         }

        //this loop is generally for printing the space

         for(int j=1;j<=nsp;j++){
             System.out.print("\t");
         }

        //this condition is generally written for last row as in last row the value is 1 less after 1st loop of star

         if(i==n){
             star--;
         }

         //this loop is for printing the star after the space
         
             for(int j=star;j>=1;j--){
             System.out.print(j+"\t");
         }
         star++;
         nsp-=2;
         System.out.println();
     }

 }
}
