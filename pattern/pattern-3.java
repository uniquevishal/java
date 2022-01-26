/* https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-3-official/ojquestion */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //take input from user
        //first loop for printing nth rows
        //second loop for printing space
        //third loop for printing star
        int n=scn.nextInt();
        
        for(int i=1;i<=n;i++){
            
            for(int spaces=n-i;spaces>0;spaces--){
                System.out.print("\t");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        

    }
}
