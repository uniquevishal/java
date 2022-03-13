// https://nados.io/question/exit-point-of-a-matrix?zen=true

import java.io.*;
import java.util.*;

public class Main {

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

    int i=0;
    int j=0;
    int dir=0; // 0 is east, 1 is south, 2 is west , 3 is north

    while(true){
      
      dir=(dir+arr[i][j])%4;

      if(dir==0){
       //east
       j++;
       if(j==arr[0].length){

           j--;
           break;
       }


      }else if(dir==1){

       //south
       i++;
       if(i==arr.length){
           i--;
           break;
       }
      }else if(dir==2){
          j--;
          if(j==-1){
              j++;
              break;
          }
      }else{
          i--;
          if(i==-1){
              i++;
              break;
          }
      }

    }

    System.out.println(i);
    System.out.println(j);


    }

}
