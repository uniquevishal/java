/* https://nados.io/question/first-index-and-last-index?zen=true  */
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

    int d=scn.nextInt();

    int left=0;
    int right=arr.length-1;
    int fi=-1;

    while(left<=right){
        int mid=(left+right)/2;
        
        if(d>arr[mid]){
            left=mid+1;

        }else if(d<arr[mid]){
            right=mid-1;

        }else{
            fi=mid;
            right=mid-1;

        }

    }
     left=0;
     right=arr.length-1;
    int li=-1;

    while(left<=right){
        int mid=(left+right)/2;
        
        if(d>arr[mid]){
            left=mid+1;

        }else if(d<arr[mid]){
            right=mid-1;

        }else{
            li=mid;
            left=mid+1;

        }

    }

    System.out.println(fi);
    System.out.println(li);



 
}
}
