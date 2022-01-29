/* https://nados.io/question/pattern-13 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        
        // we make this loop for printing the nth rows

        for(int i=0;i<n;i++){
        
    //we make this value for making the formula 

         int val=1;

        //every columns starting with 1 and end with 1,

        //making the next val from older one use the formulae ncr+1=ncr (n-r)/r+1

        for(int j=0;j<=i;j++){
            System.out.print(val+"\t");
            val=val*(i-j)/(j+1);
        }

        System.out.println();

        }

    }
}
