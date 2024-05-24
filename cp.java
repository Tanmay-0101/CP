import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class CP{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<b.length();i++){
                set.add(b.charAt(i));
            }
            HashMap<Character,Character> map=new HashMap<>();
            Character[] a= new Character[set.size()];
            a=set.toArray(a);
            Arrays.sort(a);
            for(int i=0;i<a.length;i++){
                map.put(a[i],a[a.length-i-1]);
            }
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<b.length();i++){
                ans.append(map.get(b.charAt(i)));
            }
            System.out.println(ans.toString());
        } 
    }
}

    

    