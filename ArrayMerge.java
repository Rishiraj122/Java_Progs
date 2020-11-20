import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayMerge{

    public static void anotherMethodGFG(int arr1[], int arr2[], int n, int m) 
    {
        int l=n-1;
        int f=0;
        
        while(l>=0 && f<m){
            if( arr1[l]>arr2[f] ){
                int temp=arr1[l];
                arr1[l]=arr2[f];
                arr2[f]=temp;
                l=l-1;
                f=f+1;
            }
            else{
                l=l-1;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
    public void mergeMyMethod(int arr1[], int arr2[], int n, int m){
        int temp=0;
        for(int i=0;i<n;i=i+1){
            for(int j=0;j<m;j=j+1){
                if(arr1[i]>arr2[j]){
                    temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }

        Arrays.sort(arr2);

        for(int i=0;i<n;i=i+1){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        for(int i=0;i<m;i=i+1){
            System.out.print(arr2[i]+" ");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();

        int[] arr1=new int[n];
        int[] arr2=new int[m];

        for(int i=0;i<n;i=i+1){
            arr1[i]=sc.nextInt();
        }

        for(int i=0;i<m;i=i+1){
            arr2[i]=sc.nextInt();
        }

        ArrayMerge am=new ArrayMerge();
        am.merge(arr1, arr2, n, m);


    }
}