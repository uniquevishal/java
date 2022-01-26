import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    //one for finding largest number between 3 number
    //write a if else loop for finding true or false
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=scn.nextInt();
    boolean k=true;
    int max;
    int base;
    int hypo;

    if(a>b && a>c){
      max=a;
      base=b;
      hypo=c;

    }
    else if(b>c && b>a){
       max=b;
       base=a;
       hypo=c;
    }
    else{
       max=c;
       base=b;
       hypo=a;
    }

    if(max*max!=base*base+hypo*hypo){
      k=false;
    }

    System.out.println(k);





   }
  }
