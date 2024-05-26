import java.util.*;
import java.lang.*;
import java.io.*;
public class cp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            long x=sc.nextLong();
            List<Integer> ans=new ArrayList<>();
            while(x!=0){
                if(x%2 ==0){
                    ans.add(0);
                    x/=2;
                }
                else{
                    if(x%4==1){
                        ans.add(1);
                        x=(x-1)/2;
                    }else{
                        ans.add(-1);
                        x=(x+1)/2;
                    }
                }
            }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
        } 
        
    }
}

    

    
