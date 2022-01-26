/*  https://www.pepcoding.com/resources/online-java-foundation/patterns/pattern-type-2-official/ojquestion */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         //take a input from user
         //one loop for ith rows
         //one rows for star printing
        int n=scn.nextInt();
        for(int i=n;i>0;i--){
        
        for(int j=i;j>0;j--){

       System.out.print("*\t");

        }
        System.out.println();


        }


    }
}
