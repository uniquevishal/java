/* https://nados.io/question/subsets-of-array?zen=true */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();

    }
    int lim=(1<<n);
    for(int i=0;i<lim;i++){
     
     int dec=i;

     //binary of decimal if reminder is 0 dont print array element,otherwise print element

     String str = "";

     for(int j=0;j<arr.length;j++){
         int rem= dec%2;
         dec=dec/2;
         if(rem==0){
             str=" -\t" + str;

         }else{
             str=arr[arr.length-1-j] + "\t" + str; 
         }
     }
      
      System.out.println(str);




    }

    
 }

}
