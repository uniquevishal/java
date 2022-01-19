/*take a input from user and print the counting till that number and not only print the counting also print is that number is odd or even */
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i=1;
    while(i<=n){
        if(i%2==0){
            System.out.println(i + " is even");
        }
        
        else{
            System.out.println(i+ " is odd");
        }
        i++;
    }
  }
}
