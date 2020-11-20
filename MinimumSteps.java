import java.util.*;
import java.io.*;
import java.lang.*;

class MinimumSteps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int N=sc.nextInt();
            int X=sc.nextInt();
            int Y=sc.nextInt();

            int a=X,b=Y;
            int[] dp=new int[N+1];
            Arrays.fill(dp,N);
            
            dp[0]=0;
            dp[1]=1;

            for(int i=2;i<=N;i=i+1){
                if(i>=a){
                    if(i>=X*a){
                        a=X*a;
                    }
                    dp[i]=Math.min(dp[i],dp[i-a]+1);
                }
                if(i>=b){
                    if(i>=Y*b){
                        b=Y*b;
                    }
                    dp[i]=Math.min(dp[i],dp[i-b]+1);
                }
            
                dp[i]=Math.min(dp[i],dp[i-1]+1);
                
            }

            System.out.println(dp[N]);

        }

    }
}