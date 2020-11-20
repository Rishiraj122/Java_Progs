import java.util.*;
import java.lang.*;
import java.io.*;

class NearlySorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=0;i<n;i=i+1){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }    
}
