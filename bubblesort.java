import java.util.*;
import java.io.*;
import java.lang.*;

class bubblesort{

    void bubbly(int arr[], int n){
        for(int i=0;i<n-1;i=i+1){
            for(int j=0;j<n-i-1;j=j+1){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextInt();
        }
        
        bubblesort bass=new bubblesort();
        bass.bubbly(arr, n);


        for(int i=0;i<n;i=i+1){
            System.out.print(arr[i]+" ");
        }

    }
}