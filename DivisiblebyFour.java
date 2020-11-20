import java.util.*;
import java.lang.*;
import java.io.*;

class DivisiblebyFour{

    public int divFour(int[] arr, int n){

        int count=0;
        for(int i=0;i<n-1;i=i+1){
            for(int j=i+1;j<n;j=j+1){
                if((arr[i]+arr[j])%4==0){
                    count=count+1;
                }
            }
        }

        return count;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            DivisiblebyFour dvf=new DivisiblebyFour();
            int ans=dvf.divFour(arr, n);
            System.out.println(ans);

        }
    }
}