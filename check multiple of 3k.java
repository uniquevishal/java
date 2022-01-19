/* TO CHECK WHEATHER THE GIVEN NUMBER IS 3K,3K+1,3K+2 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
        if(marks%3==0){
            System.out.println("3k");
        }
        else if(marks%3==1){
            System.out.println("3k+1");
        }
        else{
            System.out.println("3k+2");
        }

    }
}
