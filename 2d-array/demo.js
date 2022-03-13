// this is demo code to make a 2-d array */


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   int [][]arr=new int[2][4];
   arr[0][0]=11;
   arr[0][1]=12;
   arr[0][2]=13;
   arr[0][3]=14;
   
    arr[1][0]=21;
   arr[1][1]=22;
   arr[1][2]=23;
   arr[1][3]=24;
   
  
   
   for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr[0].length;j++){
           System.out.print(arr[i][j]+" ");
       }
       System.out.println();
   }
 }

}
