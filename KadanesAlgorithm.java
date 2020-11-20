import java.util.*;
import java.lang.*;
import java.io.*;

class KadanesAlgorithm{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        
        for(int i=0;i<N;i=i+1){
            arr[i]=sc.nextInt();
        }

        int temp=arr[0];

        for(int i=1;i<N;i=i+1){
            arr[i]=Math.max(arr[i],arr[i-1]+arr[i]);
            temp=Math.max(arr[i],temp);
            System.out.println(temp);
        }


        System.out.println(temp);
    }
}