import java.util.*;
import java.lang.*;
import java.io.*;
public class cp{
    public static int abs(int a,int b){
        return Math.abs(a-b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n+1];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n+1;i++){
                b[i]=sc.nextInt();
            }
            long ans=0;
            boolean isOne=false;
            int minAbs=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                ans+=abs(a[i],b[i]);
                minAbs=Math.min(minAbs,Math.min(abs(a[i],b[n]),abs(b[i],b[n])));
                if(((b[n]<=a[i]) && (b[n]>=b[i])) || ((b[n]<=b[i]) && (b[n])>=a[i])){
                    isOne=true;
                }
            }
            if(isOne==true){
                ans+=1;
            }else{
                ans+=(minAbs+1);
            }
            System.out.println(ans);
        } 
        
    }
}

    

    
