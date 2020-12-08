import java.util.*;
import java.lang.*;
import java.io.*;

class pendulum{
	public static void main (String[] args) {
		//code
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] b=new int[n];

            for(int t=0;t<n;t=t+1){
                arr[t]=sc.nextInt();
            }
            
            Arrays.sort(arr);
            int k=1,j=1;
            int mid=(n-1)/2;

            b[mid]=arr[0];
            while(j<n)
            {
                b[mid+k] = arr[j++]; 
                b[mid-k] = arr[j++];  
                k++; 
            }

            for(int t=0;t<n;t=t+1){
                System.out.print(b[t]+" ");
            }
        
        }
	}
}