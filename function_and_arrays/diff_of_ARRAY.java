/*  https://nados.io/question/difference-of-two-arrays?zen=true */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
    //part-1-making two array of size n1&n2 and taking their input from user using for loop
    int n1=scn.nextInt();
    int []one=new int [n1];
    for(int i=0;i<one.length;i++){
        one[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    int []two=new int[n2];
      for(int i=0;i<two.length;i++){
        two[i]=scn.nextInt();
    }

    //difference part 
    int []diff=new int[n2];
    
    //reaching to last element in arrays as subtraction is start from last index

    int i=one.length-1;
    int j=two.length-1;
    int k=diff.length-1;

   // intilizing carry(borrow ) is equal to zero
    int c=0;

    // loop wil runn  till k the size of diff array will not become zero

    while(k>=0){
       
        // making the digit of places of diff arr

        int d=two[j]-c;

        if(i>=0){
            d=d-one[i];
        }
        if(d<0){
            d=d+10;
            c=1;
        }else{
            c=0;
        }
        diff[k]=d;
        i--;
        j--;
        k--;
    }

    // avoiding to print the leading zero of the array  by making loop and if else condition
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]!=0){
            break;
        }else{
            idx++;
        }
    }
    while(idx<diff.length){
        System.out.println(diff[idx]);

        idx++;
    }
 }

}
