/*  https://www.pepcoding.com/resources/online-java-foundation/patterns/design-pattern-6-official/ojquestion  */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int nst=n/2+1;
        int nsp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
              for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                nsp+=2;
                nst--;

            }
            else{
                nsp-=2;
                nst++;
            }

        }

    }
}
