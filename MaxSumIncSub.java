import java.util.*;
import java.io.*;
import java.lang.*;

class MaxSumIncSub {
    
    static int max(int a, int b)
    {
        return (a>b ? a:b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] dp=new int[n];
        int max=0;

        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
            dp[i]=arr[i];
        }

        for(int i=1;i<n;i=i+1){
            for(int j=0;j<i;j=j+1){
                if(arr[j]<arr[i]){
                    dp[i]=max(dp[i],dp[j]+arr[i]);
                }
            }
        }

        max=dp[0];

        for(int i=0;i<n;i=i+1){
            if(max<dp[i]){
                max=dp[i];
            }
        }

        System.out.println(max);
    }    
}
