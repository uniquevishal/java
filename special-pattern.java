/*
1						1	
	2				2		
		3		3			
			4				
		3		3			
	2				2		
1						1	
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int val=1;
        
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j || i+j==2*n){
                    System.out.print(val+"\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            if(i<=n/2+1){
                val++;
            }
            else{
                val--;
            }
            
          System.out.println();
        }

    }
}
