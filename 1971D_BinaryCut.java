import java.util.*;
import java.lang.*;
import java.io.*;
public class cp{
    
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++){
           String b=sc.nextLine();
           int c=1;
           int r=0;
           for(int i=1;i<b.length();i++){
            if(b.charAt(i)!=b.charAt(i-1)){
                c++;
            }
            if(b.charAt(i)=='1' && b.charAt(i-1)=='0'){
                r=1;
            }
           }
           System.out.println(c-r);
        } 
        
    }
}

    

    
