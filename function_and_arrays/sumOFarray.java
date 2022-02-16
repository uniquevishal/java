/* https://nados.io/question/sum-of-two-arrays?zen=true  */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    //part-1-making two array of size n1&n2 and taling their input from user using for loop
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

    //part-2-sum-making the array of sum of size bigger array 

    //ternary opertor for finding which array size is greater and that size had been the size of sum array
    int []sum=new int[n2>n1? n2:n1];

    //as we have two start suming from last index so find last index
    int i=one.length-1;
    int j=two.length-1;
    int k=sum.length-1;
    int c=0;

    //now we run loop till k>=0 and in this loop we make digit of the sum array by adding first and last array
    while(k>=0){
        int d=c;
        if(i>=0){
            d=d+one[i];
        }
        if(j>=0){
            d=d+two[j];
        }
        //now if the digit greater than 9 than carry will 1 find by diving 10 and remainder as final digit by moduluss operator
        c=d/10;
        d=d%10;
        sum[k]=d;
        i--;
        j--;
        k--;
    }
    // if carry is greater than 0 than first print that carry and at last printing sum array element
    if(c>0){
        System.out.println(c);
    }
    for(int x=0;x<sum.length;x++){
        System.out.println(sum[x]);
    }

    
 }

}
