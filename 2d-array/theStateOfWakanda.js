/* https://nados.io/question/the-state-of-wakanda-1?zen=true  */

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn=new Scanner(System.in);
    int r=scn.nextInt();
    int c=scn.nextInt();
    
    int[][] arr=new int[r][c];
    
  // we make this 2 loop for taking the input of 2-d array
    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[0].length;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    // now we make this approach if the jth value is even than we goo down and print the value and if the value is odd than ith value is last index value and print the value and i--
    for(int j=0;j<arr[0].length;j++){
      
      if(j%2==0){
          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i][j]);
          }
      }else{
          for(int i=arr.length-1;i>=0;i--){
              System.out.println(arr[i][j]);
          }
      }
        
    }


 }

}
