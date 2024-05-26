import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class cp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int arr[]=new int[2];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]<arr[1]){
                System.out.println("No");
            }
            else{
                int d=arr[0]-arr[1];
                if((d%2)!=0){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }
        } 
        
    }
}

    

    