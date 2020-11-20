import java.util.*;
import java.io.*;
import java.lang.*;

class MDZO{
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] k=a.toCharArray();
        int n=a.length();
        int[] oc=new int[n];
        int sum=0;
        int t=0;
        for(int i=0;i<n;i=i+1)
        {
            if(k[i]=='0'){
                sum=sum+1;
            }
            if(k[i]=='1'){
                if(i>0){
                    if(k[i-1]=='1'){
                        oc[t]=oc[t]+1;
                    }
                    else{
                        t=t+1;
                        oc[t]=oc[t]+1;
                    }
                }
                else{
                    oc[t]=oc[t]+1;
                }
            }
        }

        int min=oc[0];

        for(int i=0;i<=t;i=i+1){
            if(min>oc[i]){
                min=oc[i];
            }
        }

        if(sum>0)
            System.out.println(sum-min);
        else
            System.out.println("-1");

    }
}