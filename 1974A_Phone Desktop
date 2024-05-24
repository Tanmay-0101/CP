import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
public class CP{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
           int arr[]=new int[2];
           for(int i=0;i<2;i++){
            arr[i]=sc.nextInt();
           }
           int n=0;
           if((arr[1]%2)==0){
            n+=arr[1]/2;
           }else{
            n+=((arr[1]/2)+1);
           }
           if(arr[0]<=(15*n)-(4*arr[1])){
            System.out.println(n);
           }else{
            int m=arr[0]-((15*n)-(4*arr[1]));
            if((m%15)==0){
                n+=m/15;
            }else{
                n+=((m/15)+1);
            }
            System.out.println(n);
           }
        } 
    }
}
