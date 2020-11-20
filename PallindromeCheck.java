import java.util.*;
import java.lang.*;
import java.io.*;

class PallindromeCheck{

    int max(int a, int b)
    {
        return (a>b ? a:b);
    }

    boolean is_k_pallindrome(String arr, int k){

        int n=arr.length();
        char[] a=arr.toCharArray();
        char[] b=new char[n];

        for(int i=0;i<n;i=i+1){
            b[n-i-1]=a[i];
        }

        int[][] dp=new int[n+1][n+1];

        for(int i=0;i<=n;i=i+1){
            for(int j=0;j<=n;j=j+1){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=n;j=j+1){
                if(a[i-1]==b[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int result=n - dp[n][n];

        if(result<=k){
            return true;
        }
        else{
            return false;
        }


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr=sc.next();
        int n=sc.nextInt();

        PallindromeCheck p = new PallindromeCheck();

        boolean b = p.is_k_pallindrome(arr,n);

        if(b==true){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}