/* https://nados.io/question/find-element-in-an-array?zen=true  */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // given the number of element
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    // loop for n element
    int []arr=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();

    }
    // a number for checking or find that similar number present at what index
    int d=scn.nextInt();
    int op=-1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==d){
            op=i;
        }
    }
    
    System.out.println(op);
 }

}
