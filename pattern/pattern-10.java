/* https://nados.io/question/pattern-10 */
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

           
             // write ur code here
             
    int n=scn.nextInt();
    int osp=n/2;
    int insp=-1;

     //one loop for printing the nth rows

    for(int i=1;i<=n;i++){

        //second loop for printing outer space of the pattern

        for(int j=1;j<=osp;j++){
            System.out.print("\t");
        }

        //now print the single star after outer space 

        System.out.print("*\t");

       //now the third loop for printing the inner space

        for(int j=1;j<=insp;j++){
            System.out.print("\t");
        }
 
       // condition as in 1st and the last one row have a single star

        if(i<n && i>1){
             System.out.print("*\t");

        }

       // condition for upgradation of outer and inner space

        if(i<=n/2){
            osp--;
            insp+=2;
        }
        else{
            osp++;
            insp-=2;
        }
        System.out.println();
        
    }




 }
}
