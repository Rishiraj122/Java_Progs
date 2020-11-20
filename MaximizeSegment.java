import java.util.*;
import java.lang.*;
import java.io.*;

class MaximizeSegment{

    

    public int maximizeCuts(int n, int x, int y, int z){
        
        int[] dp=new int[n+1];

        Arrays.fill(dp,-1);
        
        dp[n]=0;
        dp[0]=0;

        for(int i=0;i<=n;i=i+1){
            
            if(dp[i]!=-1){
                
                if(i+x<=n){
                
                    dp[i+x]=Math.max(dp[i+x],dp[i]+1);
                
                }
                
                if(i+y<=n){

                    dp[i+y]=Math.max(dp[i+y],dp[i]+1);
                
                }
                if(i+z<=n){
                
                    dp[i+z]=Math.max(dp[i+z],dp[i]+1);
                
                }
            }
        }

        return dp[n];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        MaximizeSegment ms=new MaximizeSegment();
        System.out.println(ms.maximizeCuts(n,x,y,z));

    }
}