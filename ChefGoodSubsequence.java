import java.util.*;
import java.lang.*;
import java.io.*;

class ChefGoodSubsequence {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){

            int n,q,x,y,max=0;

            n=sc.nextInt();
            q=sc.nextInt();

            int[] a=new int[n];
        
            for(int i=0;i<n;i=i+1){
                a[i]=sc.nextInt();
            }

            for(int w=0;w<q;w=w+1){

                x=sc.nextInt();
                y=sc.nextInt();

                a[x-1]=y;

                for(int i=0;i<n-1;i=i+1){
                    if(a[i]!=a[i+1]){
                        max=max+1;
                    }
                }

                max=max+1;

                System.out.println(max);

                max=0;

            }

        }

    }
}
