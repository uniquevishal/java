/* https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-18-official/ojquestion  */
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n=scn.nextInt();
     int spaces=0;
     int star=n;
     
     for(int i=1;i<=n;i++){
         for(int j=1;j<=spaces;j++){
             System.out.print("\t");
         }
         for(int j=1;j<=star;j++){
             if(i>1 && i<=n/2){
                 if(j==1 || j==star){
                     System.out.print("*\t");
                 }
                 else{
                     System.out.print("\t");
                 }
             }else{
             System.out.print("*\t");}
         }
         if(i<=n/2){
             
             spaces++;
             star-=2;
         }
         
         else{
             spaces--;
             star+=2;
         }
         System.out.println();
     }

 }
}
