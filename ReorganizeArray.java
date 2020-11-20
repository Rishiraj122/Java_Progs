import java.util.*;
import java.lang.*;
import java.io.*;

class ReorganizeArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            int[] b=new int[N+1];

            for(int i=0;i<N;i=i+1){
                arr[i]=sc.nextInt();
                b[i]=-1;
            }

            Arrays.sort(arr);

            for(int i=0;i<N;i=i+1){
                b[arr[i]]=arr[i];
            }


            for(int i=0;i<N;i=i+1){
                System.out.print(b[i]+" ");
            }

        }
    }
}