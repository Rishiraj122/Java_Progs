import java.util.*;
import java.lang.*;
import java.io.*;

class sumquery{

    void sum(int arr[], int b[], int n, int w){

        int L,R,sum=0;

        for(int i=0;i<w-1;i=i+2){
            L=b[i];
            R=b[i+1];

            for(int j=L;j<=R;j=j+1){
                sum=sum+(j-L+1)*(j-L+1)*arr[j];
            }

            System.out.print(sum + " ");
            sum=0;
        }
        System.out.println();
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

            int q=sc.nextInt();
            int w=2*q;
            int[] b=new int[w];

            for(int i=0;i<w;i=i+1){
                b[i]=sc.nextInt();
                b[i]=b[i]-1;
            }

            sumquery one=new sumquery();
            one.sum(arr,b,n,w);

        }

    }
}