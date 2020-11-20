import java.util.*;
import java.lang.*;
import java.io.*;

class MinDeletions{

    int max(int a, int b){
        return (a>b ? a:b);
    }

    int LCS(char arr[], char b[], int n){

        int[][] dp=new int[n+1][n+1];

        for(int i=0;i<=n;i=i+1){
            for(int j=0;j<=n;j=j+1){
                dp[i][0]=0;
                dp[0][j]=0;
            }
        }

        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=n;j=j+1){
                if(arr[i-1]==b[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return n-dp[n][n];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases-->0){

            int n=sc.nextInt();
            String x=sc.next();
            char[] arr=new char[n];
            char[] b=new char[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=x.charAt(i);
                b[n-1-i]=x.charAt(i);
            }

            MinDeletions mid = new MinDeletions();
            int result=mid.LCS(arr,b,n);

            System.out.println(result);
        }

    }
}