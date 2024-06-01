import java.util.*;
import java.lang.*;
import java.io.*;
public class cp{
   
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int arr[]=new int[2];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int n=arr[0],m=arr[1];
            int l=Math.max(0,n-m);
            int r=n+m;
            while(l<r){
                l|=(l+1);
                r|=(r-1);
            }
            System.out.println(l);
        } 
        
    }
}

    

    