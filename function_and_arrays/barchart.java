/* https://nados.io/question/bar-chart?zen=true */
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);

    //taking the value of element from user
    int n=scn.nextInt();

    //making the array of n element

    int[]arr=new int[n];

    //taking the value of element from user of the array

    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();

    }

    //finding the floor from the array by finding the maximum value from the array
    
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }

    //now printhing the star accoding the value of the element of array and the floor if the value of element is greater or equal to the floor than print star otherwise space.and update the floor and element index
    
    for(int floor=max;floor>=1;floor--){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=floor){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
