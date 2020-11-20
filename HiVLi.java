import java.util.*;
import java.lang.*;
import java.io.*;

class HiVLi{

    int HiLi(int[] hi, int[] li, int n){

        int[] dp=new int[n+1];

        dp[0]=0;
        dp[1]=hi[0];

        for(int i=2;i<n+1;i=i+1){
            dp[i]=Math.max(dp[i-2]+hi[i-1],dp[i-1]+li[i-1]);
        }

        return dp[n];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int testcases=sc.nextInt();

        while(testcases-->0){

            int n=sc.nextInt();

            int[] hi=new int[n];
            int[] li=new int[n];
            
            for(int i=0;i<n;i=i+1){
                hi[i]=sc.nextInt();
            }

            for(int i=0;i<n;i=i+1){
                li[i]=sc.nextInt();
            }

            HiVLi hil=new HiVLi();

            System.out.println(hil.HiLi(hi,li,n));
        }

    }
}