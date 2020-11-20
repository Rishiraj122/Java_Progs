/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            long sum=0;
            int flag=0;
            long[] arr=new long[n+1];
    
            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextLong();
            }
    
            for(int i=1;i<n;i=i+1){
                int j=i;
                while(flag==0){
                    if(j<n){
                        if(arr[i-1]<arr[j]){
                            flag=1;
                        }
                        else{
                            j=j+1;
                        }
                    }
                    else{
                        flag=1;
                    }
                }
                flag=0;
                sum=(sum+arr[j])%1000000001;
            }
    
            System.out.println(sum);
            
        }

    }
}