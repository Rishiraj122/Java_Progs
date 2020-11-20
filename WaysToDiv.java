import java.util.*;
import java.lang.*;
import java.io.*;

class WaysToDiv{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=1000000007;

        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();

            int[] dp=new int[n+1];
            dp[0]=dp[1]=dp[2]=1;
            dp[3]=2;
            for(int i=4;i<=n;i=i+1){
                dp[i]=((dp[i-1]%m + dp[i-3]%m)%m + dp[i-4]%m)%m;
            }

            System.out.println(dp[n]);
        }
    }
}