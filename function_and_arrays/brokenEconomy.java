/*  https://nados.io/question/broken-economy?zen=true */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        //part 1-making an array of user define size and element

        int n=scn.nextInt();
        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        } 
        int d=scn.nextInt();
        int right=arr.length-1;
        int left=0;
        int ceil=-1;
        int floor=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(d>arr[mid]){
                left=mid+1;
                floor=arr[mid];

            }else if(d<arr[mid]){
                  right=mid-1;
                  ceil=arr[mid];

            }else{
                ceil=floor=arr[mid];
                break;

            }
        }

        System.out.println(ceil);
        System.out.println(floor);

   
            

 }

}
